package org.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        max.ifPresent(n -> System.out.println("Max value is : "+ n));
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(n -> System.out.println("Min value is : "+ n));
    }
}
