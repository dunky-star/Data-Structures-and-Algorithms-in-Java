package com.dunky.javacollections.mergetwoarrays;

/*
* Write a method that merges two arrays.
*
*/

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArraysOfString {

    private static String[] mergeTwoArrays(String[] arr1, String[] arr2) {
        if (arr1.length == 0 && arr2.length == 0) {
            return null;
        }
        if(arr1.length == 0) {
            return arr2;
        }
        if(arr2.length == 0) {
            return arr1;
        }

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        list.sort(String::compareTo);
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] s1 = {"opiyo", "geoffrey", "duncan", "coming to america", "gulu"};
        String[] s2 = {"corner kamdini", "rac koko", "anga gura", "dino", "apwoyo matek"};
        System.out.println(Arrays.toString(mergeTwoArrays(s1, s2)));
    }
}
