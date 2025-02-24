/*
* Improve the BubbleSort implementation so that in the best case (which means here
that the input is already sorted), the algorithm runs in O(n) time. Explain why your
new version works --- in other words, prove that the best case running time of your
code is O(n). Call your new Java file BubbleSort1.java.
 */
import java.util.Arrays;

public class BubbleSort1 {

    private static int[] bubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length - 1; i++){
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted
            if (!swapped) break;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr2 = {100, 3, 4, 10, 30, 1};
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(arr2)));
    }
}