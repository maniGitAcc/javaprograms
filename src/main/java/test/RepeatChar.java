package test;

import java.util.HashMap;
import java.util.Map;

public class RepeatChar {
    public static void main(String[] arg) {
        String text = "This is java repeat characters";
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character :" + entry.getKey() + " Count :" + entry.getValue());
        }
    }
}
