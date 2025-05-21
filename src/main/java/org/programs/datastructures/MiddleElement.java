package org.programs.datastructures;

import java.util.LinkedList;

public class MiddleElement {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer size = list.size();
        Integer middle = list.stream().skip((size - 1) / 2).findFirst().orElse(0);
        System.out.println("The middle element is: " + middle);
    }
}
