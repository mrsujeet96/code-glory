package com.sujeet.in.leetcode;

class maxdiff {


    static int maxAbsDiff(int arr[], int n)
    {

        int min =arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        return (max - min);
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 2, 1, 5, 3 };
        int n = arr.length;
        System.out.print(maxAbsDiff(arr, n));
    }
}
