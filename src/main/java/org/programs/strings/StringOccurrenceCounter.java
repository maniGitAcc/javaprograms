package org.programs.strings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class StringOccurrenceCounter {

    public static void main(String[] s) {
        String input = "This is a sample java is program to check repeat string in java as is example";
        String[] words = input.split("\\s+");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("word = " + entry.getKey() + ", count = " + entry.getValue());
        }

        Map<String, String> strMap = new HashMap<>();
        strMap.put("name", "Mani");
        strMap.put("age", "40");
        strMap.put("country", "India");
        strMap.put(null, "Bharat");
        System.out.println("Map get function : Get of age :" + strMap.get("age"));
        System.out.println("Map get function : Get of age :" + strMap.get("age "));
        System.out.println("Map get function : Get of age null key:" + strMap.get(null));

        Hashtable<String, String> hashTable = new Hashtable<>();
        hashTable.put("name", "Mani");
        hashTable.put("age", "40");
        hashTable.put("country", "India");
        //hashTable.put(null, "Bharat");   //Null pointer Exception
        System.out.println("Hashtable get function : Get of age :" + hashTable.get("age"));
        System.out.println("Hashtable get function : Get of age :" + hashTable.get("age "));
        //System.out.println("Map get function : Get of age :" + hashTable.get(null)); //NullPointerException
    }
}


