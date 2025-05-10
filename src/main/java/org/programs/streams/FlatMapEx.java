package org.programs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] a) {
        System.out.println("Map");
        List<String> fruits = Arrays.asList("mango", "banana", "pear");
        List<Integer> length =
                fruits.stream().map(n -> n.length()).collect(Collectors.toList());
        System.out.println(length);

        System.out.println("FlatMap");
        List<List<Integer>> numberList = new ArrayList<>();
        numberList.add(Arrays.asList(1, 22));
        numberList.add(Arrays.asList(11, 22));
        List<Integer> flatMap =
                numberList.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
        System.out.println(flatMap);

    }
}

