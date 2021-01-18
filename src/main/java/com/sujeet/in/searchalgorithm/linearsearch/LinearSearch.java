package com.sujeet.in.searchalgorithm.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] intArray={-22,35,-15,7,55,1,-20};
        System.out.println(linearSearch(intArray,7));
    }

    public static int linearSearch(int[] input,int value){
        for (int i=0;i<input.length;i++){
            if (input[i]==value){
                return i;
            }
        }
        return -1;
    }
}
