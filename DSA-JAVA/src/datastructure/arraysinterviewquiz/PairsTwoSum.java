package datastructure.arraysinterviewquiz;

/**
 * Write a program to find all pairs of integers whose sum is equal to a given number.
 * Examples
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 */

public class PairsTwoSum {

    public static void main(String[] args){
        int[] intArray = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        System.out.println("Pairs: " + twoSum(intArray, 7));
    }

    // Two Sum
    public static String twoSum(int[] myArray, int sum) {
        String result = "";
        for(int i=0; i<myArray.length; i++) {
            for(int j=i+1; j<myArray.length; j++) {
                if (myArray[i]+myArray[j]==sum) {
                    result += myArray[i]+","+myArray[j]+" | ";
                }
            }
        }
        return result;
    }


}
