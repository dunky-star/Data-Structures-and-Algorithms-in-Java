package datastructure.algorithms;

import java.util.Arrays;

/**
 * When to use Merge Sort?
 *  - Whe you need stable sort
 *  - When average expected time is O(NlogN).
 *
 *  When to avoid Merge Sort?
 *  - When space is a concern.
 */

public class MergeSort {

    // Helper method - merging
    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }

    // Merge sorting
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int midIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }


    public static void main(String[] args) {

        int[] originalArray = {3,1,4,2,0, 1000,10,10,20,20,3,3,-4, -3, 5000};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "\nOriginal Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );


    }

}


