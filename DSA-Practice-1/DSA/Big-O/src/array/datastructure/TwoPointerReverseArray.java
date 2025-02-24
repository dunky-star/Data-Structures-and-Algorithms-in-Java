package array.datastructure;

import java.util.Arrays;

public class TwoPointerReverseArray {

    private static int[] reverseArray(int[] arr){
        if(arr == null || arr.length == 0){
            return arr;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 10, 20};
        System.out.println("Array after reverse array: " + Arrays.toString(reverseArray(arr)));

    }
}
