package org.programs.streams;

import java.util.Arrays;

public class SumAvg {
    public static void main(String[] args) {
        int[] numbers = new int[]{11, 22, 33, 44, 55};
        int sum = Arrays.stream(numbers).sum();
        double avg = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Sum = " + sum + " ,Avg = " + avg);
    }
}
