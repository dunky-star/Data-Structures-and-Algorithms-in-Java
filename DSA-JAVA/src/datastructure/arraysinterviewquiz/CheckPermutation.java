package datastructure.arraysinterviewquiz;

/**
 * You are given two integer arrays.
 * Write a program to check if they are permutation of each other.
 * array1:[ 2, 1, 3, 5, 4, 6]
 * array2:[ 1, 3, 2, 4, 6, 5]
 */

public class CheckPermutation {

    public static void main(String[] args){
        int[] myArray1 = {2, 1, 3, 5, 4, 6};
        int[] myArray2 = {1, 3, 2, 4, 6, 5};
        boolean result = isPermutation(myArray1, myArray2);
        System.out.println("Permutation --> " + result);

    }

    // Check is permutation?

    public static boolean isPermutation(int[] array1, int[] array2){
        if (array1.length != array2.length ) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 1;
        int mult2 = 1;

        for (int i = 0; i<array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mult1 *= array1[i];
            mult2 *= array2[i];
        }
        if (sum1 == sum2 && mult1 == mult2) {
            return true;
        }
        return false;
    }
}
