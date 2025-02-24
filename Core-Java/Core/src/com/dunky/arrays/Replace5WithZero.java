package com.dunky.arrays;
// Write a function to replace 5 with a zero if 5 follows a 3 in the array.

import java.util.Arrays;
import java.util.Objects;

public class Replace5WithZero {
    private static int[] replaceFive(int[] arr){
        if(arr == null || arr.length == 0){
            Objects.requireNonNull(arr);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 3 && arr[i+1] == 5){
                arr[i+1] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 6, 3, 5 , 7};
        System.out.println("Processed: " + Arrays.toString(replaceFive(arr1)));
    }
}
