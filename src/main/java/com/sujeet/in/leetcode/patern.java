package com.sujeet.in.leetcode;

import java.util.Scanner;
//|| i==n-1 && (j!=0 && j!=n-1 && j!=n/2-1 ) bgvrfcedxsz
public class patern {

    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0 ||i==n/2 && (j!=0 && j!=n-1) || i==n-1 && (j!=0 && j!=n-1 && j!=n/2-1 && j!=3*n/4) ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
