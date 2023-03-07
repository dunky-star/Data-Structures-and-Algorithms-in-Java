package datastructure.algorithms;

import java.util.Arrays;

/**
 * When to use Selection Sort?
 * - When we have insufficient memory
 * - Easy to implement
 *
 * When to avoid?
 * - When time is a concern.
 */

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] myArray = {1000, 4,2,6,500,1,3, 20, -10};

        selectionSort(myArray);
        System.out.println("\nSelection Sort");
        System.out.println("******************");
        System.out.println("Soreted: " + Arrays.toString(myArray) );


    }

}

