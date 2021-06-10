package com.sujeet.in.segregate;

public class SegregateEvenOdd {
    public static void seperateEvenOdd(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int left, right;
        left = 0;
        right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            while (arr[right] % 2 == 1 && left < right) {
                right--;
            }

            if (left < right) {
              swap(arr,left,right);
                left++;
                right--;
            }
        }
    }
       public static void swap(int [] arr,int left,int right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;

       }


    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1};

        SegregateEvenOdd.seperateEvenOdd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}