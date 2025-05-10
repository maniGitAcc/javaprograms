package org.programs.strings;

import java.util.HashMap;
import java.util.Map;

public class CapitalizeFirstLetter {

    public static String capitalizeFirstLetterOfEachWord(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder result = new StringBuilder();
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                result.append(firstChar).append(restOfWord).append(" ");
            } else {
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String inputString = "hello world this is a test";
        String outputString = capitalizeFirstLetterOfEachWord(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + outputString);

        //reverse and capitalize first letter
        StringBuilder strBuild = new StringBuilder(inputString);
        String outputRev = capitalizeFirstLetterOfEachWord(strBuild.reverse().toString());
        System.out.println("Reversed capitalized string: " + outputRev);
    }
}
