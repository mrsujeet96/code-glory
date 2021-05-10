package com.sujeet.in.leetcode;

public class DefangingAnIPddress {
    public static void main(String[] args) {
        String str="1.1.1.1";
        String result=defangIPaddr(str);
        System.out.println(result);
    }
    public static String defangIPaddr(String address) {

        return address.replace(".","[.]");

    }
}
