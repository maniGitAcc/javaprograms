package org.programs.datastructures;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray)); // Output: [1, 2, 3, 4, 5, 6, 7, 8]

        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2};

        int[] sortedArr = Arrays.stream(arr)
                .sorted()
                .toArray();

        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
}
