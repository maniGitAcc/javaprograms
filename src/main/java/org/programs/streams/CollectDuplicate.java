package org.programs.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 30, 40, 50);
        Set<Integer> set = new HashSet<>();
        numbers.stream().filter(num -> !set.add(num)).forEach(dup ->
                System.out.print(dup + " "));
    }
}
