package com.dunky.arrays;

// Write a program to return sum of a given element in an array.

public class SumGivenElementInArray {

    private static int sumGivenElement(int[] arr, int element){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int sum = 0;
        for (int i : arr) {

            if (i == element) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 8, 5, 3, 5, 5};
        int element = 5;
        System.out.println("Sum of a given element: " +sumGivenElement(arr1, element));
    }
}
