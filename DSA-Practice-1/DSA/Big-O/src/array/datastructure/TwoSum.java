package array.datastructure;

/*
* Two Sum:
* Given an array of integers nums and an integer target,
* return indices of the two numbers such that they add up to target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

import java.util.Arrays;

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
      for(int i = 0; i < nums.length; i++){
          for(int j = i + 1; j < nums.length; j++){
              if(nums[i] + nums[j] == target){
                  return new int[] {i, j};
              }
          }
      }
      throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {

        int[] numsArr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numsArr, 9)));

    }

}
