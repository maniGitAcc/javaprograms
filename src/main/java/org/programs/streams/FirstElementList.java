package org.programs.streams;

import java.util.Arrays;
import java.util.List;

public class FirstElementList {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "citrus", "pear");
        //findFirst example
        fruits.stream().findFirst().ifPresent(System.out::println);
        fruits.stream().skip(1).findFirst().ifPresent(System.out::println);
        fruits.stream().skip(2).findFirst().ifPresent(System.out::println);
        fruits.stream().skip(3).findFirst().ifPresent(item -> System.out.print("Fourth item in the list is : " + item+"\n"));
        //limit example
        fruits.stream().limit(2).forEach(System.out::println);
    }
}