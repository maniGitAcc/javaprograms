package org.programs.basics;

public class ReturnZero {
    public static int flipBit(int n) {
        int[] values = {1, 0};
        return values[n];
    }

    public static void main(String[] args) {
        System.out.println(flipBit(0)); // Output: 1
        System.out.println(flipBit(1)); // Output: 0
    }
}

