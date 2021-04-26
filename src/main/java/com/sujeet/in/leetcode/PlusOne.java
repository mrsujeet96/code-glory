package com.sujeet.in.leetcode;
//Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
//
//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//
//You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Example 3:
//
//Input: digits = [0]
//Output: [1]

public class PlusOne {
    public static void main(String[] args) {

        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] num = plusOne(nums);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +" ");
        }

    }

    private static  int [] plusOne(int[] digits) {

        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }       else{
                digits[i]=0;

            }

        }

        if(digits[0]==0){
            int [] newArray=new int[n+1];
            newArray[0]=1;
            return newArray;

        }
        return digits;



    }}