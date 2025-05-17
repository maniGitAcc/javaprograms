package org.programs.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IncreaseOrder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("COBOL", "Java", "C++", "C");
        words.stream().sorted(Comparator.comparing(String::length)).forEach(
                n -> System.out.print(n + " ")
        );
    }
}
