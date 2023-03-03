package datastructure.arraysinterviewquiz;

import java.util.Arrays;

/**
 * Write a function called middle that takes a list and returns a new list that contains
 * all but the first and last elements.
 *
 * myArray = [1, 2, 3, 4]
 * middle(myArray)  # [2,3]
 */

public class MiddleFunction {
    public static void main(String[] args){
        int[] myArray = { 1, 2, 3, 6, 8, 9, 0 ,0 };
        System.out.println("Mid array: " + Arrays.toString(middle(myArray)));

    }

    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }
}
