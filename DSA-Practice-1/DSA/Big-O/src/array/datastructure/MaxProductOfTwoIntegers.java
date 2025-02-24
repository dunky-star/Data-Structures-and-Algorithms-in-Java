package array.datastructure;

/*
Max Product of Two Integers:

How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)
 */

public class MaxProductOfTwoIntegers {

    private static String pairs (int[] arr){
        int maxProduct = 0;
        String pairs = "";
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] * arr[j] > maxProduct){
                    maxProduct = arr[i] * arr[j];
                    pairs = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }


    public static void main(String[] args) {
        int[] intArray = {10,200,30,95,50};
        System.out.println("Max. product: " +pairs(intArray));
    }
}
