package com.sujeet.in.leetcode;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
//
//
//Constraints:
//
//1 <= nums.length <= 105
//-109 <= nums[i] <= 109

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] prices = new int[]{7,1,5,3,6,7};
        boolean newLength = containsDuplicate(prices);

        System.out.print(newLength);


    }


    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set= new HashSet<Integer>();

        for(int i: nums){

            if (set.contains(i)) {
                return true;
            }
            else{
                set.add(i);

            }
        }
        return false;
    }
}
