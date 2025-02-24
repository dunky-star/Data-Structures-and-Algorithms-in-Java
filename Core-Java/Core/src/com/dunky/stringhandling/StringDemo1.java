package com.dunky.stringhandling;
/*
* String class is Immutable.
* advantages:
* 1. Performance is good because of the String Pool
* 2. Thread Safe
*/

public class StringDemo1 {
    public static void main(String[] args) {
        // Different ways of declaring a String.
        String s1 = "Six";
        String s2 = new String("Seven");
        char[] c = {'a', 'e', 'i', 'o', 'u'};
        String s3 = new String(c);
        byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
        String s4 = new String(b);
        String s5 = "Hello";
        s5 = "World";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.printf(s5);
    }
}
