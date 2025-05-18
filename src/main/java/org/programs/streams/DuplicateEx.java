package org.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9);

        // Count the occurrences of each number
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())
                );

        for(Map.Entry<Integer,Long> entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " -> " +entry.getValue());
        }

// Filter out non-duplicate numbers
        numbers.stream()
                .filter(number -> frequencyMap.get(number) == 1)
                .forEach(System.out::println);
    }
}
