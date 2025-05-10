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
    }

    public static class StringOccurrenceCounter {

        public static Map<String, Integer> countStringOccurrences(String input) {
            if (input == null) {
                throw new IllegalArgumentException("Input string cannot be null.");
            }

            Map<String, Integer> map = new HashMap<>();
            String[] words = input.split("\\s+"); // Split by spaces

            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            return map;
        }

        public static void main(String[] args) {
            String text = "This is a string with several words and some repeated words like string and is";
            Map<String, Integer> counts = countStringOccurrences(text);

            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                System.out.println("String: \"" + entry.getKey() + "\", Count: " + entry.getValue());
            }

            //count repeated characters in a string
            String string = "This is a sample String";
            long count = string.chars().filter(n -> n == 's').count();
            System.out.println("Count of characters = " + count);


        }
    }
}
