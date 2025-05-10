package org.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExamples {
    public static void main(String[] args) {
        // Example 1: Summing integers in a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        sum.ifPresent(s -> System.out.println("Sum: " + s));

        // Example 2: Concatenating strings in a list
        List<String> words = Arrays.asList("Hello", " ", "World", "!");
        Optional<String> sentence = words.stream().reduce(String::concat);
        sentence.ifPresent(s -> System.out.println("Sentence: " + s));

        // Example 3: Finding the maximum value in a list
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        max.ifPresent(m -> System.out.println("Maximum: " + m));

        // Example 4: Calculating the product of integers in a list, with an initial value
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // Example 5: Combining strings with a custom separator
        String combined = words.stream().reduce("", (a, b) -> a + (a.isEmpty() ? "" : ", ") + b);
        System.out.println("Combined string: " + combined);

        List<String> country = Arrays.asList("india", "pakistan", "china", "bangladesh");
        Optional<String> longest = country.stream().reduce((a, b) -> (a.length() > b.length()) ? a : b);
        longest.ifPresent(l -> System.out.println("Longest word in country list is : " + l));
    }
}
