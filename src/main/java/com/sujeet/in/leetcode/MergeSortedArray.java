package com.sujeet.in.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] array1 = new int[]{7, 1, 5, 3, 6, 7};
        int[] array2 = new int[]{2,5,6,9,0};

        int [] MergeArray = merge(array1,3,array2,2);

        for (int i = 0; i < MergeArray.length; i++) {
            System.out.print(MergeArray[i] + " ");
        }
    }


        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int k=0;
            for(int i=m;i<nums1.length;i++)
            {
                nums1[i] = nums2[k];
                k++;
            }
            Arrays.sort(nums1);

            return nums1;
        }}
