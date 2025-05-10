package org.programs.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MapExample {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Alice", 30); // Same name and age as person1

        map.put(person1, "Value 1");
        map.put(person2, "Value 2");

        System.out.println("Map contents:");
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String value1 = map.get(person1);
        String value3 = map.get(person3); // person3 is equal to person1

        System.out.println("\nValue for person1: " + value1);
        System.out.println("Value for person3: " + value3); // Should be the same as person1's value

        System.out.println("\nDoes map contain person2? " + map.containsKey(person2));
        System.out.println("Does map contain person3? " + map.containsKey(person3)); // Should return true because person3 is equal to person1

        //other way to print a map
        System.out.println("\nOther way to print a map..");
        map.forEach((k,v) -> System.out.println("Key is "+k +" Value is " +v));
    }
}
