package com.dunky.countcharacters;

public class CountChars {
    public int countChars(char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) count++;
        }
        return count;
    }

    public static void main(String[] args){
        CountChars countChar = new CountChars();
        System.out.println(countChar.countChars('a', "Sally sells sea shell on the seashore"));
    }
}
