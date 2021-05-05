package com.sujeet.in.leetcode;

public class MaxArarySubArray {

    public static void main(String[] args) {
        int arr[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double avg = findMaxAverage(arr, k);
        System.out.println(avg);
    }

    public static double findMaxAverage(int[] nums, int k) {


        double sum = 0;
        double res = Integer.MIN_VALUE;

        if (nums.length == 1 && nums.length == k) {
            return res = nums[0];
        }

        for (int i = 0; i < nums.length - k + 1; i++) {
            int temp = i + k - 1;
            while (temp >= i) {
                sum += nums[temp];
                temp--;
            }

            sum = sum / k;

            if (res < sum) {
                res = sum;
            }

            sum = 0;
        }

        return res;


    }


}

