package org.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionEx {
    public static void main(String[] s) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> l2 = Arrays.asList(3, 4, 5, 7, 8, 9);
        List<Integer> result = l1.stream().filter(l2::contains).collect(Collectors.toList());
        System.out.println(result);

        // remove duplicates
        List<Integer> original = Arrays.asList(1, 2, 3, 3, 4, 3, 5, 7, 8, 9, 9);
        List<Integer> unique = original.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

    }

}
