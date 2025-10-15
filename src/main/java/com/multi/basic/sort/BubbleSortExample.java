package com.multi.basic.sort;
//{5, 1, 9, 7, 2,3}
public class BubbleSortExample {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []array={5, 1, 9, 7, 2,3};
        System.out.println("Original Array");
        printArray(array);
        System.out.println("Change Array");
        printArray(array);
    }
}
