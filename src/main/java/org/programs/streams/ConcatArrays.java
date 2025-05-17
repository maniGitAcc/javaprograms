package org.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConcatArrays {
    public static void main(String[] args) {
        int[] a1 = new int[]{12, 42, 6, 24};
        int[] a2 = new int[]{6, 21, 5, 22};
        int[] result = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
