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

        // nameLengths will be {"Alice": 5, "Bob": 3, "Charlie": 7}
        Map<String, Integer> nameLengths = Stream.of("Alice", "Bob", "Charlie")
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));
        nameLengths.forEach((key, value) -> System.out.println(key + ": " + value));

        String concatenatedNames = Stream.of("Alice", "Bob", "Charlie")
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated Names : " + concatenatedNames);

        // Collecting to an Array
        String[] nameArray = Stream.of("Alice", "Bob", "Charlie")
                .toArray(String[]::new);
        System.out.println("nameArray : " + Arrays.toString(nameArray));


        OptionalDouble average = IntStream.of(1, 2, 3, 6, 12).average();
        System.out.println(average.getAsDouble());

        boolean len = Stream.of("one", "two", "three").anyMatch(n -> n.length() > 5);
        System.out.println(len);

        List<String> names = Arrays.asList("bus", "car", "van");
        names.stream().forEach(n -> System.out.println(n.toUpperCase(Locale.ROOT)));

        List<Integer> numbers = Arrays.asList(5, 4, 3, 2);
        Collections.sort(numbers);
        System.out.println(numbers);


    }
}
