package array.datastructure;

/*
* Duplicate Number:
Write a function which takes integer array as a parameter and returns a new integer
* array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
*
*/

import java.util.Arrays;

public class RemoveDuplicateArray {
    public static int[] removeDuplicates(int[] arr) {

        int[] uniqueArr = new int[arr.length];

        int index = 0;
        for(int i = 0; i < arr.length; i++){
            boolean isDuplicate = false;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArr[index++] = arr[i];
            }
        }
        return Arrays.copyOf(uniqueArr, index);
    }


    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 2, 3, 4, 5};
        System.out.println("Duplicates removed " + Arrays.toString(removeDuplicates(myArray)));

    }

}
