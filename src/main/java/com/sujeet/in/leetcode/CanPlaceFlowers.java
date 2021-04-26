package com.sujeet.in.leetcode;
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

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,0,0,1};
        boolean num = canPlaceFlowers(nums,1);

        System.out.print(num);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {


        for(int i=0;i<flowerbed.length;i+=2){
            if(flowerbed[i] == 0){
                if(i == flowerbed.length-1 || flowerbed[i+1] == 0){
                    n--;
                    if(n==0)
                        return true;
                }
                else
                    i++;
            }
        }
        return n <= 0;



    }
}
