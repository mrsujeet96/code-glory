package com.sujeet.in.leetcode;

public class ResverseString {
    public static void main(String[] args) {
        String str="sujeet";

        char [] result=str.toCharArray();

        for(int i=result.length-1;i>=0;i--){
            System.out.println(result[i]);
        }

    }
}
