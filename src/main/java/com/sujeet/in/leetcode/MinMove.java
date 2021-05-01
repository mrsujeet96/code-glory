package com.sujeet.in.leetcode;

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
