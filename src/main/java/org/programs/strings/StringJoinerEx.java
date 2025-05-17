package org.programs.strings;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Orange");
        System.out.println(joiner1.toString());

        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Red");
        joiner2.add("Green");
        joiner2.add("Blue");
        System.out.println(joiner2.toString());

        StringJoiner joiner3 = new StringJoiner(" - ", "{", "}");
        System.out.println("Empty StringJoiner: " + joiner3);
        joiner3.add("One");
        System.out.println("Non-empty StringJoiner: " + joiner3);

        StringJoiner joiner4 = new StringJoiner(":", "(", ")");
        StringJoiner joiner5 = new StringJoiner("-", "[", "]");
        joiner5.add("A");
        joiner5.add("B");
        joiner4.merge(joiner5);
        System.out.println(joiner4.toString());
    }
}
