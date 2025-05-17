package org.programs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> orgList = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> evenList = orgList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddList = orgList.stream().filter(n -> !evenList.contains(n)).collect(Collectors.toList());
        System.out.println("Odd List is :" + oddList);
        System.out.println("Even list is " + evenList);
    }
}

