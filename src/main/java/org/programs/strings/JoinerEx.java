package org.programs.strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class JoinerEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("mani", "kani", "sana");
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (String s : words) {
            stringJoiner.add(s);
        }
        System.out.println(stringJoiner);
    }
}
