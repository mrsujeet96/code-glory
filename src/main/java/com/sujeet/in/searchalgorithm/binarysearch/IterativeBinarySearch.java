package com.sujeet.in.searchalgorithm.binarysearch;

public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] intArray={-22,-15,1,7,20,35,55};
        System.out.println(iterativeBinarySearch(intArray,-15));
        System.out.println(iterativeBinarySearch(intArray,-35));
        System.out.println(iterativeBinarySearch(intArray,545));
        System.out.println(iterativeBinarySearch(intArray,1));

    }

    public static int iterativeBinarySearch(int[] input, int value){
        int start=0;
        int end=input.length;
        while (start<end){
            int midpoint=(start+end)/2;
            System.out.println("midpoint= " + midpoint);
            if (input[midpoint]==value){
                return midpoint;
            }
            if (input[midpoint]<value){
                return midpoint+1;
            }else {
                end=midpoint;
            }

        }
        return -1;

    }



}
