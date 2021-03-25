package com.sujeet.in.leetcode;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 1, 3, 5, 5, 7};
        int newLength = removeDuplicates(nums);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;

        }

        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }

        }
        return index;
    }
}

