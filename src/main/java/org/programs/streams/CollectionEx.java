package org.programs.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionEx {
    public static void main(String[] args) {
        Set<String> stringSet = Stream.of("some", "one", "some", "one")
                .collect(Collectors.toSet());
        System.out.println(stringSet);

        // Example
        Stream.of("some", "one", "some", "one")
                .forEach(p -> System.out.println(p));

        OptionalDouble average = IntStream.of(1, 2, 3, 6, 12).average();
        System.out.println(average.getAsDouble());

        boolean len = Stream.of("one","two","three").anyMatch(n ->n.length()>5);
        System.out.println(len);

        List<String> names = Arrays.asList("mani","sana","kani");
        names.stream().forEach(n -> System.out.println(n.toUpperCase(Locale.ROOT)));

        List<Integer> numbers = Arrays.asList(5,4,3,2);
        Collections.sort(numbers);
        System.out.println(numbers);



    }
}
