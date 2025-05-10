package org.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.HashMap;
import java.util.Map;


public class MapMergeEx {

    public static void main(String[] args) {
        Map<String, String> wordCounts = new HashMap<>();

        wordCounts.put("usa", "U");
        wordCounts.put("jobs", "J");
        wordCounts.put("software", "S");
        wordCounts.put("technology", "T");
        wordCounts.put("opportunity", "O");

        System.out.println("===================================");

        System.out.println("Before Merge Data from Map ::: ");

        wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

        System.out.println("====================");

        // merge(key, value, remappingFunction)
        // If the specified key is not already associated with a value or is
        // associated with null, associates it with the given non-null value.
        wordCounts.merge("jobs", " - New Value Added", (v1, v2) -> v1 + v2);

        System.out.println(wordCounts.get("jobs"));

        System.out.println("====================");

        System.out.println("After Merge Data from Map ::: ");

        wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

        remove();
    }

    static void remove() {
        Map<String, Integer> wordCounts = new HashMap<>();

        wordCounts.put("usa", 100);
        wordCounts.put("jobs", 200);
        wordCounts.put("software", 50);
        wordCounts.put("technology", 70);
        wordCounts.put("opportunity", 200);

        System.out.println("===================================");

        System.out.println("Before Remove Data from Map ::: ");

        wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));
        wordCounts.remove("jobs");

        System.out.println("After Removed Data from Map ::: ");

        wordCounts.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));

    }

}


