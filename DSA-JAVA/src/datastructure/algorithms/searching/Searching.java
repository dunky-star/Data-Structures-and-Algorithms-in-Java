package datastructure.algorithms.searching;

/**
 * When to use Linear Search?
 * - When we have unsorted arrays/data, Linear search is good.
 * When not to use?
 * - When we have sorted array or data.
 *
 * When to use Binary Search? Binary search works only for sorted array data.
 */

public class Searching {

    // Linear Search
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int arr[], int value) {
        int start = 0;
        int end = arr.length-1;
        int middle = (start+end)/2;
        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle -1;
            } else {
                start = middle + 1;
            }
            middle = (start+end)/2;
        }
        if (arr[middle] == value) {
            System.out.println("The element is found at the index: " + middle);
            return middle;
        } else {
            System.out.println("The element " + value+ " not found.");
            return -1;
        }

    }



}
