package datastructure.algorithms.searching;

/**
 * When to use?
 * - When we have unsorted arrays/data, Linear search is good.
 * When not to use?
 * - When we have sorted array or data.
 */

public class Searching {
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }


}
