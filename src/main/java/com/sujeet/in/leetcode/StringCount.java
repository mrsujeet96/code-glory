package com.sujeet.in.leetcode;

import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {
//        String str="sujeet";
//        int count=0;
//
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)!=' '){
//                count++;
//            }}
//            System.out.println(count);
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();

        tests:
        for(int t = 0; t < T; t++)
        {
            String s = input.nextLine();
            int deletions = 0;
            int currentCount = 1;
            for(int i = 1; i < s.length(); i++)
            {
                if(s.charAt(i) != s.charAt(i-1))
                {
                    deletions += currentCount - 1;
                    currentCount = 1;
                    continue;
                }
                currentCount++;
            }
            deletions += currentCount - 1;
            System.out.println(deletions);
        }
    }

    }

