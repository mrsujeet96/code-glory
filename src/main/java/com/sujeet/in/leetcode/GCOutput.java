package com.sujeet.in.leetcode;

public class GCOutput{


    public static void main(String[] args) {

     String str="abcabdjkfkj";
     int s=stringReduction(str);
        System.out.println(s);


    }




   public static int stringReduction(String s) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
       int lengthStr = s.length();


        for( int i=0 ;i <lengthStr;i++)
        {
            if(s.charAt(i)== 'a')
                countA++;

            if(s.charAt(i)== 'b')
                countB++;

            if(s.charAt(i)=='c')
                countC++;
        }

        if (countA==lengthStr || countB==lengthStr || countC==lengthStr)
            return lengthStr;

        if((countA%2==0 && countB%2==0 && countC%2==0)||
                (countA%2==1 && countB%2==1 && countC%2==1))
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }


}
