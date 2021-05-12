package com.sujeet.in.leetcode;
//Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//
//Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
//
//You may assume that each input would have exactly one solution and you may not use the same element twice.
//
//
//
//Example 1:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
//Example 2:
//
//Input: numbers = [2,3,4], target = 6
//Output: [1,3]
//Example 3:
//
//Input: numbers = [-1,0], target = -1
//Output: [1,2]

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        int target = 9;
        int[] arr = twoSum2(nums, target);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(i + " ");
        }

    }
    public  static int[] twoSum2(int[] numbers, int target) {
        int [] arr=new int[2];


        for(int i=0;i<numbers.length;i++){

            for(int j=i+1 ;j<numbers.length;j++){

                if((numbers[i]+numbers[j])==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                }
            }}

        return arr;
}
}
