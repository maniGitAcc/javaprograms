package org.programs.strings;

public class RegEx  {
    public static void main(String[] s){
        String input = "This is my first regex  example.";
        String regEx = input.replaceAll("\\s","_");
        System.out.println(regEx);
        String regExPlus = input.replaceAll("\\s+","_");
        System.out.println(regExPlus);

    }
}
