package com.sujeet.in.leetcode;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1

public class SingleNumer {
    public static void main(String[] args) {
        int[] array={1,1,4,2,2,4,5};
       int num =singleNumber(array);
        System.out.println(num);



    }

    public static int singleNumber(int[] nums) {

        int num=0;

        for(int i=0;i<nums.length;i++){
            num ^=nums[i];
        }
        return num;

    }
}
