package org.programs.strings;

public class Palindrome {
    public static void main(String[] args){
        String str = "levels";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equalsIgnoreCase(sb.toString())){
            System.out.println("Given string is a palindrome");
        }else{
            System.out.println("String is not a palindrome.");
        }
    }
}
