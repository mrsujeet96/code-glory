package com.sujeet.in.leetcode;

import java.util.Arrays;

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
