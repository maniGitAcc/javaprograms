package org.programs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] a) {
        System.out.println("Map");
        List<String> fruits = Arrays.asList("mango", "banana", "pear");
        List<Integer> length =
                fruits.stream().map(String::length).collect(Collectors.toList());
        System.out.println(length);

        System.out.println("FlatMap");
        List<List<Integer>> numberList = new ArrayList<>();
        numberList.add(Arrays.asList(1, 22));
        numberList.add(Arrays.asList(11, 22));
        List<Integer> flatMap =
                numberList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatMap);

        //flapMap with string of streams
        List<List<String>> names = Arrays.asList(
                Arrays.asList("cat","mouse"),
                Arrays.asList("dog","bull","hen")
        );
        List<String> result = names.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(result);
    }
}

