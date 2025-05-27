package org.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaptoInt {
    public static void main(String[] arg){
        List<Integer> numbers = Arrays.asList(5, 4, 9, 10, 22, 18);
        Integer secLargest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secLargest);

        int[] number = {5, 2, 8, 1, 9, 4};

        List<Integer> rev = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int[] rev1 =rev.stream().mapToInt(Integer::intValue).toArray();

        for(int i : rev1){
            System.out.print(i + " ");
        }
    }
}
