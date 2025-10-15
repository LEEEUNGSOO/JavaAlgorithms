package com.multi.basic.sort;

public class SelectionSort {

    public static void printArray(int []array){
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    //선택정렬
    public static void selectionSort(int []array){
        for (int i=0;i<array.length-1;i++){
            int minIndex = i;
            //최솟값 탐색
            for (int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;//최솟값 인텍스 업데이트
                }//if
            }//for
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }//for
    }
    public static void main(String[] args) {
        int []array={10,8,5,2,6,4};
        System.out.println("Original Array");
        printArray(array);
        selectionSort(array);
        System.out.println("Sorted Array");
        printArray(array);

    }
}
