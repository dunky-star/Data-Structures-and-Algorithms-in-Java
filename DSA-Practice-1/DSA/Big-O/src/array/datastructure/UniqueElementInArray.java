package array.datastructure;
/*
IsUnique / Contains Duplicate:
Write a program to check if an array is unique or not.

Example

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true
 */

public class UniqueElementInArray {

    private static boolean isUnique(int[] arr){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
         return true;
    }

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,6};
        System.out.println(isUnique(intArray));  // true
    }
}
