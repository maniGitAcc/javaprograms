package org.programs.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescending {
    public static void main(String[] arg) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(l -> System.out.print(l + " "));
        List<String> country = Arrays.asList("Italy", "America", "Russia", "Ukraine");
        System.out.println();
        country.stream().sorted(Collections.reverseOrder()).forEach(c -> System.out.print(c + " "));
    }
}
