package com.sujeet.in.leetcode;
//442. Find All Duplicates in an Array
//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//
//You must write an algorithm that runs in O(n) time and uses only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
//Example 2:
//
//Input: nums = [1,1,2]
//Output: [1]
//Example 3:
//
//Input: nums = [1]
//Output: []

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesIArray {
    public static void main(String[] args) {

        int[] array = new int[]{7,1,4,5,3,6,1,4};
        List<Integer> newLength = findDuplicates(array);

        System.out.print(newLength);

    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls=new LinkedList<>();

        List<Integer> list = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1f;i++)
        {
            if(nums[i] == nums[i+1])
                list.add(nums[i]);
        }
        return list;

    }
}
