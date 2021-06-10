package com.sujeet.in.leetcode;

import java.util.Scanner;

public class MergeAndSortArray {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of first array");
//        int n1= sc.nextInt();
//        System.out.println("Enter the size of second array");
////        int n2=sc.nextInt();
//        int [] arr1=new int[n1];
//        int [] arr2=new int[n2];
//        for (int i=0;i<n1;i++){
//            arr1[i]=sc.nextInt();
//        }
//        for (int i=0;i<n2;i++){
//            arr2[i]=sc.nextInt();
//        }

        MergeAndSortArray mr=new MergeAndSortArray();
        int [] arr1=new int[]{1,2,1,4,6,7};
        int [] arr2=new int[]{1,2,1,4,2,7};
        int n1=arr1.length;
        int n2=arr2.length;

        mr.mergeArray(arr1,arr2,n1,n2);
        System.out.println(mr);
//        int [] result=mergeArray(arr1,arr2,n1,n2);
//        int[] result1=sortArray(arr1);

//        for (int i=0;i<result1.length;i++){
//
//            System.out.println(result1[i]);
//        }


//
//        for (int i=0;i<result.length;i++){
//
//        System.out.println(result[i]);
//        }
    }

    public  void mergeArray(int [] arr1,int[] arr2,int n1, int n2){
        int n3=n1+n2;
        int [] merge=new int[n3];
        int pos=0;
        for(int element : arr1){
            merge[pos]=element;
            pos++;
        }
        for(int element : arr2){
            merge[pos]=element;
            pos++;
        }
        sortArray(merge);
        remove(merge);


    }
       public static void sortArray(int [] arr) {

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;i<arr.length;j++){
                int temp=0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

       }
       public  static void remove(int [] arr){
        int index=1;
        for(int i=0;i<arr.length;i++)  {
            if(arr[i]!=arr[i+2]){
                arr[index++]=arr[i+2];
            }


        }


       }
}

