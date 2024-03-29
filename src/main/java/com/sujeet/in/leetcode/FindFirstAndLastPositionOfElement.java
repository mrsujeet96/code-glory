package com.sujeet.in.leetcode;
//34. Find First and Last Position of Element in Sorted Array
//Medium
//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]

public class FindFirstAndLastPositionOfElement {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int [] arr = searchRange(nums, target);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
        public static int[] searchRange(int[] nums, int target) {

            int[] res = {-1,-1};

            for(int i = 0;i<nums.length;i++){

                if(nums[i] == target){

                    res[0] = i;

                    while(i+1<nums.length && nums[i] == nums[i+1])
                        i++;
                    res[1] = i;
                }
            }
            return res;
        }
    }

