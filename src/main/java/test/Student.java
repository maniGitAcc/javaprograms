package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StudentInfo {
    public static void main(String[] ars) {
        List<Student> students = Arrays.asList(
                new Student(1001, "mani", "mca", 30),
                new Student(1002, "kumar", "cse", 80),
                new Student(1003, "ajay", "cse", 70),
                new Student(1004, "suraj", "mba", 55)
        );

        Student secHigh = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed())
                .skip(1).findFirst().orElse(null);
        System.out.println(secHigh);
        //no of student in each dept
        Map<String, Long> studMap = students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        for (Map.Entry<String, Long> entry : studMap.entrySet()) {
            System.out.println("Dept : " + entry.getKey() + ", count : " + entry.getValue());
        }
    }
}
public class Student {
    //name, id, dept, marks
    // find student has second highest mark
    public Student(int id, String name, String dept, int marks) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", marks=" + marks +
                '}';
    }
    private String dept;
    private int marks;
}

