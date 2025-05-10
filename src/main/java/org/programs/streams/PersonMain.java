package org.programs.streams;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonMain {
    public static void main(String[] s) {
        List<Persons> persons = Arrays.asList(new Persons("mani", 41),
                new Persons("sana", 7), new Persons("kani", 1)
        );
        double avg = persons.stream().mapToInt(Persons::getAge).average().orElse(0);
        DecimalFormat df = new DecimalFormat("0.00");
        String avgStr = df.format(avg);
        System.out.println(avgStr);
    }
}
class Persons {
    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;
}
