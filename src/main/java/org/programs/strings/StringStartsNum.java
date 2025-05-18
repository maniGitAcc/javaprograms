package org.programs.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartsNum {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("one", "2wo", "3hree", "four");
        str.stream().filter(w -> Character.isDigit(w.charAt(0))).forEach(l ->
                System.out.print(l + " "));
    }
}
