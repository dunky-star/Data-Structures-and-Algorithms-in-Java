package datastructure.interviewquiz;

import java.util.HashMap;

/**
 * Given two array1 and array2 below:
 * array1[1, 3, 5]
 * array2[2, 4, 5]
 * Write a code to determine if the two arrays have a common element/item.
 */

// Below is an efficient solution using Big O(n).

public class ArrayHash2 {

    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1){
            myHashMap.put(i, true);
        }

        for (int j : array2){
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        System.out.println("Common item: " + itemInCommon(array1, array2));
    }
}
