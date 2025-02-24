package com.dunky.javacollections.arraystolist;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMinMax {
    private static Integer[] findMinMax(Integer[] arr) {
        if (arr.length == 0){
            return null;
        }

        Integer min = Collections.min(Arrays.asList(arr));
        Integer max = Collections.max(Arrays.asList(arr));
        return new Integer[]{min, max};
    }

    public static void main(String[] args) {
        Integer[] arr1 = {100, 400, 10, 19, 20, 50, 400, 500, 5500};
        System.out.println("Minimum and Maximum elements respectively: " +Arrays.toString(findMinMax(arr1)));
    }
}
