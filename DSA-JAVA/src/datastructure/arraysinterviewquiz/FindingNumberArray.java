package datastructure.arraysinterviewquiz;

/**
 * Search for a value.
 * Write a program to check if an array contains a number in Java.
 */

public class FindingNumberArray {

    public static void main(String[] args){

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Number found at index: " + linearSearch(intArray, 8));

    }

    // Array linear search.
    public static int linearSearch(int[] intArray, int value){

        for(int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
