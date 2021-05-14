package com.sujeet.in.leetcode;

public class ImplementStr {
    public static void main(String[] args) {
        String str="hello";
        String needle="ll";
        int result=strStr(str,needle);
        System.out.println(result);


    }
    public  static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);


    }
}
