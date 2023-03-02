package datastructure.arraysinterviewquiz;

import java.util.Arrays;

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
        int[] intArray = {2,4,13,15, 5};
        int[] result = twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));
    }

    // Two Sum
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[] { i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }


}
