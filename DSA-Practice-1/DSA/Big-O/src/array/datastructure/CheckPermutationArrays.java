package array.datastructure;

/*
Permutation:
You are given two integer arrays. Write a program to check if they are permutation of each other.

Example

int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)
Output

true
 */

public class CheckPermutationArrays {

    public static boolean permutation(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 1;
        int mult2 = 1;
        for(int i = 0; i < array1.length; i++){
          sum1 += array1[i];
          sum2 += array2[i];
          mult1 *= array1[i];
          mult2 *= array2[i];
        }
        if (sum1 == sum2 && mult1 == mult2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};

        System.out.println("Are two arrays permutation? " +permutation(array1, array2));

    }
}
