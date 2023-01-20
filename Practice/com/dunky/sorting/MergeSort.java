package com.dunky.sorting;

/**
 * MERGE_SORT(arr, beg, end)
 *
 * if beg < end
 * set mid = (beg + end)/2
 * MERGE_SORT(arr, beg, mid)
 * MERGE_SORT(arr, mid + 1, end)
 * MERGE (arr, beg, mid, end)
 * end of if
 *
 * END MERGE_SORT
 */

public class MergeSort {

    // Merge sort method
    private void mergeSort(int a[], int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    // Merge method
    private void merge(int[] array, int start, int middle, int end){
        int i = start;
        int j = middle + 1;
        int[] arrayTemp = new int[end - start + 1];
        for (int k = 0; k < arrayTemp.length; k++){
            if(i <= middle && (j > end || array[i] <= array[j])){
                arrayTemp[k] = array[i];
                i++;
            }else{
                arrayTemp[k] = array[j];
                j++;
            }
        }
        System.arraycopy(arrayTemp, 0, array, start, arrayTemp.length);
    }

    /* Function to print the array */
    void printArray(int a[])
    {
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i] + " ");
         }
    }

    // Main function
    public static void main(String[] args){

        // Array to sort
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };

        MergeSort mClass = new MergeSort();
        System.out.println("\nBefore sorting array elements are - ");
        mClass.printArray(a);

        // Applying the Merge Sort
        mClass.mergeSort(a, 0, a.length - 1);
        System.out.println("\nAfter sorting array elements are - ");
        mClass.printArray(a);
        System.out.println("");

    }
}
