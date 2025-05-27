package org.programs.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
        int num = sc.nextInt();
        if(Arrays.stream(numbers).filter(l -> l == num).findFirst().isPresent()){
            System.out.println("Entered number is present in the array.");
        }else {
            System.out.println("Entered number is NOT present in the array.");
        }
    }
}