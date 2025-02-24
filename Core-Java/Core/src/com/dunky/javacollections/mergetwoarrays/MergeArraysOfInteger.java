package com.dunky.javacollections.mergetwoarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArraysOfInteger {

    private static Integer[] mergeTwoArr(Integer[] arr1, Integer[] arr2) {
        if (arr1.length == 0 && arr2.length == 0){
            return null;
        }
        if(arr1.length == 0){
            return arr2;
        }
        if (arr2.length == 0) {
            return arr1;
        }

        ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(arr1));
        l.addAll(Arrays.asList(arr2));
        l.sort(Integer::compareTo);
        return l.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] int1 = {100, 400, 10, 19, 20, 50, 400, 500, 5500};
        Integer[] int2 = {200, 440, 20, 19, 21, 50, 450, 500, 6500};
        System.out.println("New merged arrays: " +Arrays.toString(mergeTwoArr(int1, int2)));
    }
}
