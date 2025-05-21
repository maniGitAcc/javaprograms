package org.programs.datastructures;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayIntersection {

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 5, 6, 7, 8};

        Set<Integer> intersection = findIntersection(array1, array2);
        System.out.println("Intersection: " + intersection); // Output: Intersection: [3, 5]
    }

    public static Set<Integer> findIntersection(Integer[] array1, Integer[] array2) {
        Set<Integer> set1 = Arrays.stream(array1).collect(Collectors.toSet());
        return Arrays.stream(array2)
                .filter(set1::contains)
                .collect(Collectors.toSet());
    }
}
