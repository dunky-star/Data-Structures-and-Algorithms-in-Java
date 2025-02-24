package array.datastructure;

/*
*
Remove Duplicates from Sorted Array:
Given a sorted array nums, remove the duplicates in-place such that each element
*  appears only once and returns the new length. Do not allocate extra space for another array;
* you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Input: nums = [1, 1, 2]
Output: 2
*
*/

public class RemoveDuplicateSortedArray {
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
      int[] arr = {1, 1, 2, 2, 3, 4,10, 20, 10};
        System.out.println("Length: " +removeDuplicates(arr));
    }

}
