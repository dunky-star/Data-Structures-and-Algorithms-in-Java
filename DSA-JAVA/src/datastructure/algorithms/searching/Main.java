package datastructure.algorithms.searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] arr = {10, 2, 3, 4, 56, 60, 70, 79, 20, 30, 5, 200};
        int result = Searching.linearSearch(arr, 0);
        if(result != -1) {
            System.out.println("The element is found at the index: " + result);

        }else{
            System.out.println("The element not found.");
        }

        Arrays.sort(arr);
        Searching.binarySearch(arr, 5);
    }
}
