package com.multi.basic.sort;


public class ShellSort {
    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public  void shellSort(int []array) {

    }
    public static void main(String[] args) {
        int[] array = {12, 34, 54, 2, 3};
        System.out.println("SellSort Before");
        printArray(array);
        System.out.println("SellSort After");

    }
}
