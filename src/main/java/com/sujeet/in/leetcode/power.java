package com.sujeet.in.leetcode;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.pow;

public class power {
    public static void main(String[] args) {

        Scanner scannerTest = new Scanner(System.in);
        System.out.println("Enter a name here: ");
        String str = scannerTest.nextLine().toUpperCase();
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sum += 1 + ch - 'A';
            }
        }
        System.out.printf("The sum of %s is %d%n", str, sum);
    }
}






