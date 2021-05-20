package com.sujeet.in.leetcode;
//125. Valid Palindrome
//Easy
//
//2006
//
//3854
//
//Add to List
//
//Share
//Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.

public class ValidPlindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String s1="Java is a programing language";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));

    }
    public static boolean isPalindrome(String str) {

        String  s=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
