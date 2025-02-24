package com.dunky.arrays;

// Write a program to check if the first character is the same as last characters in an array.

public class CompareFirstLastCharacter {

    private static boolean checkFirstLastChar(String s){
        if(s.isEmpty()){
            return false;
        }

        String cleaned = s.trim().toLowerCase();
        char[] chars = cleaned.toCharArray();

        if(chars[0] == chars[chars.length - 1]){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
       String s1 = "Opiyo Geoffrey Duncano";
        System.out.println("Is last and first character the same? " +checkFirstLastChar(s1));
    }
}
