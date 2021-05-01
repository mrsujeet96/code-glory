package com.sujeet.in.leetcode;

import java.util.Arrays;

//Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
//
//In one move, you can increment or decrement an element of the array by 1.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: 2
//Explanation:
//Only two moves are needed (remember each move increments or decrements one element):
//[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
//Example 2:
//
//Input: nums = [1,10,2,9]
//Output: 16

public class MinMove2 {

    public static void main(String[] args) {
        int[] array={1,10,2,9};
        int num =minMoves2(array);
        System.out.println(num);

    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int  j=nums.length-1;
        int moves = 0;
        while(i<j){
            moves+=nums[j--]-nums[i++];

        }

        return moves;

    }

}
