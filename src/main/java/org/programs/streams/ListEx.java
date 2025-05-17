package org.programs.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ListEx {
    public static void main(String[] ar) {

        List<Employee> emp = Arrays.asList(
                new Employee("mani", 1, 40, 22.55),
                null, null, null,
                new Employee("manik", 2, 20, 2200.55)
        );
        System.out.println("Display Employee list using foreach :");

        List<Employee> filteredList =
                emp.stream().filter(Objects::nonNull).filter(n -> n.getAge() > 5).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
        List<Employee> updatedEmployees = emp.stream().filter(Objects::nonNull).map(
                employee -> {
                    employee.setSalary(employee.getSalary() * 2);
                    return employee;
                }).collect(Collectors.toList());

        System.out.println("Double all employee salary :\n" + updatedEmployees);
        System.out.println("Display the non-null list using enhanced for loop :");
        for(Employee employee : updatedEmployees){
           System.out.println("ID : "+employee.getId() +" ,Name : "+ employee.getName()+" ,Salary : "+ employee.getSalary());
        }
    }
}

class Employee {
    private String name;
    private int id;
    private int age;
    private double salary;

    public Employee(String name, int id, int age, double sal) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = sal;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double d) {
        this.salary = d;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int ag) {
        this.age = ag;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "id='" + id + '\'' +
                "age='" + age + '\'' +
                "salary=" + salary +
                '}';
    }
}
