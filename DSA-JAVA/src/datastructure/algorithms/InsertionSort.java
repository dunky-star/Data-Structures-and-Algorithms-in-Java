package datastructure.algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {

        int[] myArray = {4000,2,6,5,-100,0,32,500, 1057};

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );


    }

}

