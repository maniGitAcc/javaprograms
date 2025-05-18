package org.programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args){
        String word = "This is a simple java program";
        String rev = Arrays.stream(word.split(" ")).map(
                s -> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(rev);
    }
}
