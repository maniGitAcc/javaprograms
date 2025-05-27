package org.programs.files;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

//Class moved to talent project
public class ResourceReader {

    public String readFileFromResources(String fileName) throws IOException {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("File not found: " + fileName);
            }
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
                return scanner.useDelimiter("\\A").next();
            }
        }
    }

    public static void main(String[] args) {
        ResourceReader reader = new ResourceReader();
        try {
            List<Associate> associates = getAssociatesFromFile(reader);

            //List of all unlock associate
            List<Associate> unlockAssociates = associates.stream().filter(n -> n.getLockStatus().equalsIgnoreCase("unlock")).collect(Collectors.toList());
            System.out.println("Unlock Associates(" + unlockAssociates.size() + ") are below:");
            for (Associate associate : unlockAssociates) {
                System.out.println(associate.getId() + "\t" + associate.getName() + "\t" + associate.getAvailableDate() + "\t" + associate.getLockStatus());
            }

            lockAnAssociate(unlockAssociates);

            List<Associate> lockAssociates = associates.stream().filter(n -> n.getLockStatus().equalsIgnoreCase("lock")).collect(Collectors.toList());
            System.out.println("lock Associates(" + lockAssociates.size() + ") are below:");
            for (Associate associate : lockAssociates) {
                System.out.println(associate.getId() + "\t" + associate.getName() + "\t" + associate.getAvailableDate() + "\t" + associate.getLockStatus());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Associate> getAssociatesFromFile(ResourceReader reader) throws IOException {
        String fileContent = reader.readFileFromResources("associate.txt");
        List<String> records = Arrays.stream(fileContent.split("\r\n")).skip(1).collect(Collectors.toList());
        List<Associate> associates = new ArrayList<>();
        for (String s : records) {
            Associate associate = new Associate();
            String[] line = s.split("\\|");
            associate.setId(Integer.parseInt(line[0]));
            associate.setName(line[1]);
            Date date = new Date(line[2]);
            associate.setAvailableDate(date);
            associate.setLockStatus(line[3]);
            associates.add(associate);
        }
        System.out.println("Total associates available are : " + associates.size());
        return associates;
    }

    private static void lockAnAssociate(List<Associate> unlockAssociates) {
        //enter the associate id to lock, if status is unlock then change to lock
        System.out.println("Enter the associate Id to lock :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Optional<Associate> AssociateFound = Optional.ofNullable(unlockAssociates.stream().filter(n -> n.getId() == input).findFirst().orElse(null));
        if (AssociateFound.isPresent()) {
            AssociateFound.get().setLockStatus("lock");
            System.out.println("Associate with id " + input + " is locked..");
        } else {
            System.out.println("Associate with id " + input + " is not available to lock..");
        }
    }
}

class Associate {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    private int id;

    @Override
    public String toString() {
        return "Associate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", availableDate=" + availableDate +
                ", lockStatus='" + lockStatus + '\'' +
                '}';
    }

    private String name;
    private Date availableDate;
    private String lockStatus;
}