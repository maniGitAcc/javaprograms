package org.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 2, 3, 5, 5);
        System.out.println("Min 3 numbers from list :");
        numbers.stream().sorted().distinct().limit(3).forEach(n -> System.out.print(n + " "));

        System.out.println("\nMax 3 numbers from list :");
        numbers.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).forEach(n -> System.out.print(n + " "));
    }
}
