package org.programs.strings;

public class Reverse {
    public static void main(String a[]) {
        String input = "welcome to java";
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        System.out.println(reverse.substring(0, 1).toUpperCase() + reverse.substring(1));
    }
}
