package org.programs.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 3, 5, 1};
        List<Integer> result = IntStream.of(numbers).boxed().collect(Collectors.toList());
        Collections.reverse(result);
        int[] value = result.stream().mapToInt(Integer::intValue).toArray();
        for (int i : value) {
            System.out.print(i + " ");
        }
    }
}
