package org.programs.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }
}
