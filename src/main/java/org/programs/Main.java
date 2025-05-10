package org.programs;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> integerList = Arrays.asList(1, 22, 3, 4, 5);
        System.out.println(Collections.max(integerList));
        //Find even numbers in list
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6);
        List<Integer> evenList =
                numbers.stream().filter(n -> (n % 2 == 0)).collect(Collectors.toList());
        System.out.print(evenList);

        //Sum of square integers
        List<Integer> numbrs = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquare = numbrs.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("\n" + sumOfSquare);

        //first element matches a condition
        List<String> words = Arrays.asList("apple", "banana", "orange");
        Optional<String> result = words.stream().filter(s -> s.startsWith("o")).findFirst();
        result.ifPresent(System.out::println);

        //Group string by length
        List<String> words2 = Arrays.asList("abc", "asdf", "van", "car");
        Map<Integer, List<String>> group = words2.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("\n" + group);

        //concat and join
        List<String> joins = Arrays.asList("my", "name", "is", "mani");
        String rsult = joins.stream().collect(Collectors.joining(","));
        System.out.println("\n" + rsult + " Length =" + rsult.length());

        //remove duplicates from list
        List<String> duplicateStrings = Arrays.asList("bus", "bus", " bus");
        List<String> distinctString = duplicateStrings.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct String in the list ="+distinctString);

        //Find max
        List<Integer> numbers1 = Arrays.asList(1, 3, 5, 7, 9);
        int max = numbers1.stream().max(Integer::compare).orElse(0);
        System.out.println("Max Element in the List =" + max);

        //sum of even No.
        List<Integer> numbers2 = Arrays.asList(1, 2, 4, 3, 5);
        int evenSum = numbers2.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even num =" + evenSum);

        //Elements less than five
        List<Integer> lessFive = numbers2.stream().filter(n -> (n < 5)).collect(Collectors.toList());
        System.out.println("Less 5 =" + lessFive);
    }
}