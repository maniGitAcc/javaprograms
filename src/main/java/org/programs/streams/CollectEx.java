package org.programs.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
    public static void main(String[] args) {
        //toList()
        List<String> names = Stream.of("Ajay", "Vimal", "Ashok", "Vimal", "Ajay").collect(Collectors.toList());
        System.out.println(names);

        //toSet()
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        System.out.println(uniqueNames);

        //toMap()
        Map<String, Integer> namesMap =
                uniqueNames.stream().collect(Collectors.toMap(name -> name, String::length));

        for (Map.Entry<String, Integer> entry : namesMap.entrySet()) {
            System.out.println("Name : " + entry.getKey() + ", Len : " + entry.getValue());
        }

        //joining list to string
        String joinNames = Stream.of("apple", "banana", "pear").collect(Collectors.joining("-", "<", ">"));
        System.out.println(joinNames);

        //count no. of elements in list
        long nameCount = Stream.of("English", "Hindi", "Tamil").collect(Collectors.counting());
        System.out.println("No of languages is : " + nameCount);

        //averagingInt, averagingDouble
        double avg = Stream.of("English", "Hindi").collect(Collectors.averagingInt(String::length));
        System.out.println(avg);

        //find the longest word
        List<String> words = Arrays.asList("India", "Pakistan", "France", "Japan", "Korea");
        String longest = words.stream().max(Comparator.comparingInt(String::length)).orElse("none");
        System.out.println(longest);

        //group by
        Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(String::length));
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println("Length : " + entry.getKey() + ", Countries : " + entry.getValue());
        }

        //reduce
        List<String> stat = Arrays.asList("welcome", "to", "streams", "api");
        String sentence = stat.stream().reduce("", (a, b) -> a + " " + b).trim();
        System.out.println(sentence);

    }
}
