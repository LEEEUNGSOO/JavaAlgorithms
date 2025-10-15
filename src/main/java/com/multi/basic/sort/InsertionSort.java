package com.multi.basic.sort;
//삽입정렬
public class InsertionSort {

    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }// {12, 11, 13, 5, 6}
    public static void insertionSort(int []array) {
        int n=array.length;
        for (int i = 1; i < n; i++) {
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key) {
                array[j+1]=array[j];
                j=j-1;
                printArray(array);
            }
            array[j+1]=key;//swap

        }

    }
    // {12, 11, 13, 5, 6}
    //정렬된 상태에 삽입하는 과정을 말한다
    //11(key)-->12 >11 11인 값이 더 작아서 위치 이동
    //11,12,13,5,6
    //13(key)
    //11 ,12, 13 ,5, 6
    //5(key) 정렬된 데이터 (11,12,13)
    //5,11,12,13,6
    //6(key) 정렬된 데이터(5,11,12,13) 13>6,12>6,11>, 5>6
    //5,6,11,12,13

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Original Array");
        printArray(array);
        insertionSort(array);
        System.out.println("After insertionSort");
        printArray(array);

    }
}
