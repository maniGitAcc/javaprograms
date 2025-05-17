package org.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] arg) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 7, 8, 12, 75);
        //reverse order
        List<Integer> rev = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(rev);
        //ascending order
        numbers.stream().sorted().forEach(n -> {
            System.out.print(n + " ");
        });
        System.out.println();

        List<String> words = Arrays.asList("apple", "banana", "pears");
        //reverse order
        List<String> revWords = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revWords);
        //ascending order
        words.stream().sorted().forEach(n -> {
            System.out.print(n + " ");
        });

        //reverse using compareTo
        List<String> str = Arrays.asList("bus", "car", "flight", "van");
        List<String> revStr = str.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(revStr);
    }
}
