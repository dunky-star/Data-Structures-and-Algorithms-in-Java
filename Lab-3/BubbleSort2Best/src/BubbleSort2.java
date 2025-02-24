/*
* Recall that in BubbleSort, at the end of the first pass through the outer loop, the
largest element of the array is in its final sorted position. After the next pass, the next
largest element is in its final sorted position. After the ith pass (i=0,1,2,…), the
largest, second largest,…, i+1st largest elements are in their final sorted position. Use
this observation to cut the running time of BubbleSort in half. Implement your
solution in code, and prove that you have improved the running time in this way. Call
your new Java file, which contains the improvements from this problem and the
previous problem, BubbleSort2.java.
 */
import java.util.Arrays;

public class BubbleSort2 {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            int newn = 0;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap arr[j - 1] and arr[j]
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                    newn = j; // Update the position of the last swap
                }
            }
            if (!swapped) break; // Early exit if no swaps occurred
            n = newn; // Reduce the range of the array to be checked
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 7, 8};
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(bubbleSort(arr1)));
    }
}