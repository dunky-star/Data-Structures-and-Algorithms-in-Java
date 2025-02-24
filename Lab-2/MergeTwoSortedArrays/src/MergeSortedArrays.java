// Merge two sorted integer arrays

import java.util.Arrays;

public class MergeSortedArrays {

    private static int[] merge(int[] arr1, int[] arr2){
        if(arr1.length == 0 ){
            return arr2;
        }
        if(arr2.length == 0 ){
            return arr1;
        }

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0; // Initialize the pointers for arr1, arr2 and result respectively.

        // Traversing both arrays
        while (i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        // Store remaining elements of arr1
        while(i < n1){
            result[k++] = arr1[i++];
        }
        // Store remaining elements of arr2
        while(j < n2){
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 8, 17};
        int[] arr2 = {2, 4, 8, 11, 13, 21, 23, 25};
        int[] arr3 = {};
        int[] arr4 = {};

        int[] mergedArray1 = merge(arr1, arr2);
        int[] mergedArray2 = merge(arr1, arr3);
        int[] mergedArray3 = merge(arr3, arr4);

        System.out.println("Merged array1: " + Arrays.toString(mergedArray1));
        System.out.println("Merged array2: " + Arrays.toString(mergedArray2));
        System.out.println("Merged array3: " + Arrays.toString(mergedArray3));

    }
}