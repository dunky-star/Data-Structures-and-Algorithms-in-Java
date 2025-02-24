package com.dunky.stringhandling;

import java.util.Arrays;

/*
* String is immutable
* StringBuffer is mutable and synchronized
* StringBuilder is mutable but not synchronized.
*
*/

public class StringDemo2 {

    // Method that splits a String of characters into words
    private static String[] splitStr(String str) {
        if (str.length() < 2) {
            return new String[]{str};
        }
        String[] splitStr = null;
        for (int i = 0; i < str.length(); i++) {
            splitStr = str.split(" ");
        }
        return splitStr;
    }

    public static void main(String[] args) {
        String s = "Geoffrey Duncan Opiyo";
        System.out.println("Length of the string is: " +s.length());
        System.out.println("Index of the string is: " +s.indexOf("D"));
        System.out.println("Substring of the string is: " +s.substring(0, 5));
        System.out.println("Character at: " +s.charAt(9));

        System.out.println(Arrays.toString(splitStr(s)));

        StringBuffer sb = new StringBuffer();
        sb.append("All the power is within you.");
        sb.append(" You can do anything and everything.");
        sb.insert(3, "xyz");
        sb.delete(5, 7);
        System.out.printf("The initial capacity: %d\n", sb.capacity());
        System.out.println("StringBuffer content: " +sb);
    }
}
