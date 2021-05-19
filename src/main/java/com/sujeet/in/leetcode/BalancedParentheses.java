package com.sujeet.in.leetcode;

//Given a string that consists of left and right parentheses, ( and ), balance the
//parentheses by inserting parentheses as necessary. Determine the minimum
// number of characters that must be inserted.
//
//Example:-
// s='(()))'
//Insert 1 left parenthesis at the left end of the string to get ((())) The string is balanced
//after 1 insertion
//Sample Input11
// "()))"
//Sample Output1
//2
//Explanation
// Insert a '(' 2 times  at the beginning of the of the String to make it valid;



public class BalancedParentheses {
    public static void main(String[] args) {
        String s="(()))";
        int  bl=balancedParentheses(s);

        System.out.println(bl);


    }

    public static int  balancedParentheses(String s) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                countA++;
            }
            if (s.charAt(i) == ')') {
                countB++;
            }


        }

        if (countA == countB)
            return 0;
        else if(countA>countB)
            return countA-countB;
        else
            return countB-countA;


    }

}
