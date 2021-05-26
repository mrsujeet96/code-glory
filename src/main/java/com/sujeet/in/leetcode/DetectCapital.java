package com.sujeet.in.leetcode;

//520. Detect Capital

//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "leetcode".
//Only the first letter in this word is capital, like "Google".
//Given a string word, return true if the usage of capitals in it is right.
//
//
//
//Example 1:
//
//Input: word = "USA"
//Output: true
//Example 2:
//
//Input: word = "FlaG"
//Output: false

public class DetectCapital {
    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = "INDIA";
        String s2 = "FlaG";
        System.out.println(detectCapitalUse(s));
        System.out.println(detectCapitalUse(s1));
        System.out.println(detectCapitalUse(s2));

    }

    public static boolean detectCapitalUse(String s) {

        if (s.equals(s.toUpperCase())) {
            return true;

        } else if (s.equals(s.toLowerCase())) {
            return true;

        } else if (Character.isUpperCase(s.charAt(0)) && s.substring(1, s.length()).equals(s.substring(1, s.length()).toLowerCase())) {
            return true;
        } else {
            return false;
        }

    }
}
