package com.dunky.stringhandling;

// Common interview question
public class ReverseAString {

    private static String reverseStr(String str){
        if(str == null || str.isEmpty()){
            return null;
        }
        byte[] b1 = str.getBytes();
        byte[] b2 = new byte[b1.length];

        for(int i = 0; i < b1.length; i++){
            b2[i] = b1[b1.length-i-1];
        }
        return new String(b2);
    }

    public static void main(String[] args) {
        String testStr = "Reverse a string";
        System.out.println(reverseStr(testStr));
    }
}
