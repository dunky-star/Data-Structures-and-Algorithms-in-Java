package arraylist.datastructure;
/*
Create a method which takes an array as a parameter and reverses it.
- Find the runtime of the created method
 */

import java.util.Arrays;

public class FnReverseAnArray {

    private static int[] reverseArray(int[] arr){
        if(arr.length == 0){
            return null;
        }
        for(int i = 0; i < arr.length/2; i++){   // ------> O(N/2)
            int last = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
        }
        return arr; // ---> O(N)  => Overall time complexities = O(N)
    }

    public static void main(String[] args) {

        int[] intArray = {1, 20, 3, 4, 50, 100};
        System.out.println(Arrays.toString(reverseArray(intArray)));

    }
}
