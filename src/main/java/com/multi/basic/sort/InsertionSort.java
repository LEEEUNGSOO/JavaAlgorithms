package com.multi.basic.sort;
//삽입정렬
public class InsertionSort {

    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public static void insertionSort(int []array) {

    }
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Original Array");
        printArray(array);
        insertionSort(array);
        System.out.println("After insertionSort");

    }
}
