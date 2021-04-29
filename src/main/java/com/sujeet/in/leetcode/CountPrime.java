package com.sujeet.in.leetcode;

public class CountPrime {

    public static void main(String[] args) {
        int n=10;
        int prime=countPrimes(n);
        System.out.println(prime);

    }
    public static int countPrimes(int n) {

        int[] arr=new int[n];
        for(int i=2;i<arr.length;i++){
            for(int j=i+i;j<arr.length;j=j+i){
                arr[j]=1;
            }
        }
        int count=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==0)
                count++;
        }
        return count;


    }
}
