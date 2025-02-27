package datastructure.arraysinterviewquiz;

import java.util.Arrays;

/**
 * What is an array?
 * An array is data structure consisting of a collection of elements of same type
 * or simply a collection of variable of same data type.
 * Each element can be uniquely identified based on their location by unique index.
 * The size cannot be changed.
 */

public class ArraysDataStructure {

    int[] arr = null;

    public ArraysDataStructure(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    // Array Traversal

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }

    }

    //Search for an element in the given Array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }

        System.out.println(valueToSearch + " is not found");
    }

    // Delete value from Array
    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");

        }
    }


    public static void main(String[] args){
        int[] intArray = {10, 20, 30, 40, 50, 60, 100};
        System.out.println(Arrays.toString(intArray));

        ArraysDataStructure arrDataStructure = new ArraysDataStructure(10);
        arrDataStructure.insert(0, 100);
        arrDataStructure.insert(1, 200);
        arrDataStructure.insert(2, 300);
        arrDataStructure.insert(3, 400);
        arrDataStructure.insert(4, 500);
        arrDataStructure.insert(5, 600);
        arrDataStructure.insert(6, 700);
        arrDataStructure.insert(7, 800);
        arrDataStructure.insert(8, 900);
        arrDataStructure.insert(9, 1000);

        arrDataStructure.traverseArray();
        System.out.println("\n");
        arrDataStructure.searchInArray(700);
    }


}
