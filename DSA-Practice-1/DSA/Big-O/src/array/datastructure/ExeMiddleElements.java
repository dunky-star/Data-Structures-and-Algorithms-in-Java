package array.datastructure;

import java.util.Arrays;

/*
* Middle Function:
* Write a function called middle that takes an array and returns a new array that
* contains all but the first and last elements.
*/
public class ExeMiddleElements {
    public static int[] middle(int[] array) {

        if(array.length < 3){
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }
        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];

        // Copy the middle elements from the original array to the new array
        // excluding the first and last elements.
        for (int i = 1; i < array.length - 1; i++) {
            middleArray[i - 1] = array[i];
        }
       return middleArray;
    }

    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(middle(myArray)));
    }
}
