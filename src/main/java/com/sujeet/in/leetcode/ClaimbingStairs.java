package com.sujeet.in.leetcode;

import java.util.Scanner;

public class ClaimbingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int result=climbStairs(n);
        System.out.println(result);

    }
    public static int climbStairs(int n) {
        int a = 1 , b = 2;

        int result= 0;
        if(n ==1){
            return 1;

        }

        if(n == 2){
            return 2;
        }

        for(int i = 3 ; i <= n ; i++){
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

}
