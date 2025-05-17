package org.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiple {
    //print list that has multiples of 5
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 10, 95, 96);
        //multiples of 5
        numbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList()).forEach(n -> System.out.print(n + " "));
        System.out.println();
        //non multiples of 5
        numbers.stream().filter(n -> n % 5 > 0).collect(Collectors.toList()).forEach(n -> System.out.print(n + " "));

    }
}
