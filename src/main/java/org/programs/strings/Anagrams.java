package org.programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {
    public static void main(String[] args) {
        String a1 = "CarRace";
        String a2 = "RaceCar";
        a1 = Stream.of(a1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        a2 = Stream.of(a2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (a1.equals(a2)) {
            System.out.println("Two strings are anagrams..");
        }
    }
}
