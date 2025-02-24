package big.o.complexities.dropconstant;

import java.util.Arrays;

// Find Minimum and Maximum from array of integers;
public class MinMax {

    //Approach 1:
    private static int[] findMinMax1 (int[] arr1){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : arr1){
            if (x < min) min = x;
            if(x > max) max = x;
        }
        return new int[] {min, max};
    }

    // Approach 2:

    private static int[] findMinMax2(int[] arr2){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for( int x : arr2){
            if(x < min){
                min = x;
            }
        }

        for(int x : arr2){
            if(x > max){
                max = x;
            }
        }
      return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 9, 1};
        System.out.println("Values from function 1: " + Arrays.toString(findMinMax1(arr)));
        System.out.println("Values from function 2: " + Arrays.toString(findMinMax1(arr)));
    }
}
