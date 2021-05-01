package com.sujeet.in.leetcode;
//Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
//
//In one move, you can increment n - 1 elements of the array by 1.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: 3
//Explanation: Only three moves are needed (remember each move increments two elements):
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
//Example 2:
//
//Input: nums = [1,1,1]
//Output: 0

import java.util.Arrays;

public class MinMove {
    public static void main(String[] args) {


        int[] array = {1, 10, 2, 9};
        int num = minMoves(array);
        System.out.println(num);
    }
    public static int minMoves(int[] nums) {

        Arrays.sort(nums);
        int num=0;

        for(int i=nums.length-1;i>=0;i--){

            num +=nums[i] -nums[0];

        }
        return num;

    }

}
