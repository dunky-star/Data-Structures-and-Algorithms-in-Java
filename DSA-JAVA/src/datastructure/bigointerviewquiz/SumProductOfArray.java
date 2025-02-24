package datastructure.bigointerviewquiz;

/**
 * Create a function which calculates the sum and product of the
 * elements of an array.
 * Find the time complexity for created method.
 */

public class SumProductOfArray {

    public static void main(String[] args){
        int[] arrayNum = {5, 4, 10, 8, 11, 68, 87, 200, -1};
        // Function call.
        sumAndProductArray(arrayNum);
    }

    // The time complexity for this method is Big O(2n).
    // Drop constant, hence, Big O(n).
    public static void sumAndProductArray(int[] arr){
        int sum = 0;
        int product = 1;
        for (int i : arr) {  // --------> O(n)
            sum += i;
        }
        for (int j : arr) {  // --------> O(n)
            product *= j;
        }
        System.out.println("Sum of array is: " + sum + ", the product of array is: " + product);
    }

}
