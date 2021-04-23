package com.sujeet.in.leetcode;

//iven an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: 6
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: 24
//Example 3:
//
//Input: nums = [-1,-2,-3]
//Output: -6
//

import java.util.Arrays;



public class ProductOfMaxThreeNum {
    public static void main(String[] args) {

        int[] prices = new int[]{7,1,5,3,1,3,3,6};
        int max = maximumProduct(prices);

        System.out.print(max);

    }
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        return Math.max(nums[0] * nums[1] * nums[n - 1],
                nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }

    }

