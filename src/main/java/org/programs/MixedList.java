package org.programs;

import java.util.ArrayList;

public class MixedList {
    public static void main(String[] arg) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add(10);
        myList.add("mani");
        myList.add(34.84);

        int num = (int) myList.get(0);
        String name = (String) myList.get(1);
        double wage = (double) myList.get(2);

        System.out.println("num= " + num + " ,name= " + name + " ,wage= " + wage);
    }
}
