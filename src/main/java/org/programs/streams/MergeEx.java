package org.programs.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeEx {
    public static void main(String[] s) {
        List<Integer> i1 = List.of(1, 3, 5);
        List<Integer> i2 = List.of(2, 4, 6, 8);
        List<Integer> merged = Stream.concat(i1.stream(), i2.stream()).sorted().collect(Collectors.toList());
        System.out.println(merged);
    }
}
