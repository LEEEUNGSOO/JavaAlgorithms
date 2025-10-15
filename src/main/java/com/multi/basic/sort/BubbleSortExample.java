package com.multi.basic.sort;
//{5, 1, 9, 7, 2,3}
public class BubbleSortExample {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    //{5, 1, 9, 7, 2,3}
    //{0,1},{1,2},{2,3},{3,4}
    public static void bubbleSort(int []array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] >  array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int []array={5, 1, 9, 7, 2,3};
        System.out.println("Original Array");
        printArray(array);
        bubbleSort(array);
        System.out.println("Change Array");
        printArray(array);
    }
}
