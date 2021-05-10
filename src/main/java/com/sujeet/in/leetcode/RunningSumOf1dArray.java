package com.sujeet.in.leetcode;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]

public class RunningSumOf1dArray {
    public static void main(String[] args) {

        int[] array = new int[]{7, 1, 5, 3, 6, 7};


        int[] result = runningSum(array);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            result[i] = sum;

        }

        return result;
    }


}
