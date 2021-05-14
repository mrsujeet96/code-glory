package com.sujeet.in.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str="hello world";
        int result=lengthOfLastWord(str);
        System.out.println(result);

    }

      public static int lengthOfLastWord(String s) {
        int count=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            } else if (count > 0) {
                return count;
            }
        }

        return count;

    }

}
