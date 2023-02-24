package datastructure.interviewquiz;

/**
 * Given two array1 and array2 below:
 * array1[1, 3, 5]
 * array2[2, 4, 5]
 * Write a code to determine if the two arrays have a common element/item.
 */

// Below is an inefficient solution using Big O(n2).
public class ArrayHash1 {
    public static boolean itemInCommon(int[] array1, int[] array2){
        for (int i : array1){
            for (int j : array2){
                if(i == j) return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        System.out.println("Common item: " + itemInCommon(array1, array2));
    }
}
