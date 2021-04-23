package com.sujeet.in.leetcode;
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//-231 <= nums[i] <= 231 - 1

public class MajorityElement {
    public static void main(String[] args) {



        int[] prices = new int[]{7,1,5,3,1,3,3,6};
        int maj = majorityElement(prices);

        System.out.print(maj);
    }

            public static int majorityElement(int[] nums) {

                int major = nums[0];
                int count = 1;

                for(int i = 1; i < nums.length ; i++) {

                    if(major == nums[i]) {
                        count++;
                    } else {
                        count--;
                    }

                    if(count <= 0) {
                        major = nums[i];
                        count = 1;
                    }
                }


                return major;
    }
}
