package datastructure.bigointerviewquiz;

import java.util.Arrays;

/**
 * Create a method which takes an array as a parameter and reverses it.
 * Find the run time of the created method.
 */

public class ReverseArray {

    public static void main(String[] args){
        int[] arrayReverse = {1, 2, 3, 4, 5, 6};
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(arrayReverse)));

    }

    // Drop constant term ---> Big O(n).
    public static int[] reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){  // ---> Big O(N/2)
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
        return arr;
    }

}
