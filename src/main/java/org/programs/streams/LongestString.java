package org.programs.streams;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] a) {
        List<String> words = List.of("banana", "apple", "mango", "orange", "pear", "watermelon");
        Optional<String> longest =
                words.stream().max(Comparator.comparingInt(String::length));
        System.out.println("Longest fruit in the list is : " + longest.get() + ", its length is : " + longest.get().length());

        //using compare method
        List<String> strings = Arrays.asList("banana", "apple", "mango", "orange", "pear", "watermelon");
        String large = strings.stream().max((x, y) -> Integer.compare(x.length(), y.length())).orElse("none");
        System.out.println("Longest fruit in the list is : " + large + ", its length is : " + large.length());

        BigInteger big = new BigInteger(String.valueOf(123));
    }
}