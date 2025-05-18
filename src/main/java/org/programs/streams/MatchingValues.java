package org.programs.streams;

import java.util.Arrays;
import java.util.List;

public class MatchingValues {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(23, 45, 12);
        List<Integer> list2 = Arrays.asList(23, 12);
        list1.stream().filter(list2::contains).forEach(n -> System.out.print(n + " "));
    }
}
