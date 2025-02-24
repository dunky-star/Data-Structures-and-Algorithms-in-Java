package com.dunky.interviewquiz;

/*
* Given an array of integer, write a java method to reverse it using TWO POINTERS.
*/

import java.util.Arrays;

public class ReverseArrayInteger {

    private static int[] reverseArray(int[] arr){
        if(arr == null || arr.length == 0){
            return arr;
        }

        int left  = 0;
        int right = arr.length -1;
        while(left < right){
            int temp =  arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {100,2,30,4,5,66,7,8,9000};
        int[] arr2 = {};
        System.out.println(Arrays.toString(reverseArray(arr1)));
        System.out.println(Arrays.toString(reverseArray(arr2)));
    }
}
