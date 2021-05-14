package com.sujeet.in.leetcode;
//Implement strStr().
//
//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//Clarification:
//
//What should we return when needle is an empty string? This is a great question to ask during an interview.
//
//For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
//
//
//
//Example 1:
//
//Input: haystack = "hello", needle = "ll"
//Output: 2
//Example 2:
//
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1
//Example 3:
//
//Input: haystack = "", needle = ""
//Output: 0

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
