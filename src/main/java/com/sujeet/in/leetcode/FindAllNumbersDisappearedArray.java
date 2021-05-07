package com.sujeet.in.leetcode;
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> MergeArray = findDisappearedNumbers(array1);


        System.out.print(MergeArray);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        int count[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i] - 1] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[i] == 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}


