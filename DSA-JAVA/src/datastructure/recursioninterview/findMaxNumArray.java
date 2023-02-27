package datastructure.recursioninterview;

import static java.lang.Math.max;

public class findMaxNumArray {

    public static void main(String[] args){
        int[] sampleArray = {5, 4, 10, 8, 11, 68, 87, 200, -1};
        // Function call.

    }

    public static int findMaxNumRecursive(int[] sampleArray, int n){
        if (n == 1) return sampleArray[0];
        return max(sampleArray[n-1], findMaxNumRecursive(sampleArray, n -1 ) );
    }
}
