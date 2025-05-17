package org.programs.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(33, 22, 11, 44, 55, 66, 99, 88, 77);
        Integer secLarge = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secLarge);
    }
}
