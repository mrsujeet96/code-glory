package com.sujeet.in.searchalgorithm.binarysearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 565));
        System.out.println(recursiveBinarySearch(intArray, 1));
    }

    public static int recursiveBinarySearch(int [] input, int value){
        return recursiveBinarySearch(input,0,input.length,value);
    }


    public static int recursiveBinarySearch(int[] input, int start,int end,int value){
        if(start>=end){
            return -1;
        }

        int midpoint=(start+end)/2;
        System.out.println("midpoin= " +midpoint);

        if(input[midpoint]==value){
            return midpoint;
        }
        else if (input[midpoint]<value){
            return recursiveBinarySearch(input,midpoint+1,end,value);
        }else {
            return recursiveBinarySearch(input,start,midpoint,value);
        }
    }
}
