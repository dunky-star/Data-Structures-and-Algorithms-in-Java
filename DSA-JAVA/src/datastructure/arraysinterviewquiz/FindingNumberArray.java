package datastructure.arraysinterviewquiz;

/**
 * Search for a value.
 * Write a program to check if an array contains a number in Java.
 */

public class FindingNumberArray {

    public static void main(String[] args){
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Number found " + linearSearch(intArray, 13));

    }

    // Array linear search.
    public static boolean linearSearch(int[] intArray, int value){
        for (int i : intArray) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    
}
