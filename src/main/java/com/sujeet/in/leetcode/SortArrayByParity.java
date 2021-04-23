package com.sujeet.in.leetcode;
//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//
//You may return any answer array that satisfies this condition.
//
//
//
//Example 1:
//
//Input: [3,1,2,4]
//Output: [2,4,3,1]
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//
//
//Note:
//
//1 <= A.length <= 5000
//0 <= A[i] <= 5000

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,1,3,3,6,4,2,8};
        int [] sort = sortArrayByParity(prices);

       for(int i=0;i<sort.length;i++){
           System.out.println(sort[i]);
       }
    }

    public static int[] sortArrayByParity(int[] A) {

        int i=0;
        int j=A.length-1;
        while(i<j){

            if(A[i]%2 > A[j]%2){

                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;

            }
            if(A[i]%2==0){
                i++;
            }
            if(A[i]==1){
                j--;
            }


        }
        return A;
}}
