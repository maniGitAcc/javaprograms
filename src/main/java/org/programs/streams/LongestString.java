package org.programs.streams;

import java.util.*;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] a) {
        List<String> words = List.of("banana", "apple", "mango", "orange", "pear", "watermelon");
        Optional<String> longest =
                words.stream().max(Comparator.comparingInt(String::length));
        System.out.println("Longest fruit in the list is : " + longest.get()+", its length is : " +longest.get().length());
    }
}