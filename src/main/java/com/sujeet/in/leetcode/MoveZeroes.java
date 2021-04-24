package com.sujeet.in.leetcode;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]
//

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = new int[]{9, 6, 4, 2, 0, 5, 7, 0, 1};
        int[] num = moveZeroes(nums);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }

    public static int[] moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {

                nums[index++] = nums[i];
            }
        }


        for (int i = index; i < nums.length; i++) {

            nums[i] = 0;
        }
        return nums;
    }


}
