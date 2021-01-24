package com.sujeet.in.sorting.selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        int [] intArray={20,35,66,-10,90,6,21};

        for (int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest=0;
            for (int i=1;i<=lastUnsortedIndex;i++){
                if (intArray[i]>intArray[largest]){
                    largest=i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);

        }
        for (int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array,int i,int j){
        if (i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
