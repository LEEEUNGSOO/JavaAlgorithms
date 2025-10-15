package com.multi.basic.sort;


public class ShellSort {
    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public  void shellSort(int []array) {
      // int[] array = {12, 34, 54, 2, 3};(0 ,1,2,3,4 )
      //배열의 갯수  array.length
        //(12,54),(34,2),(3) gap2
        //0,2,    1,3, 4
        //12, 2,54,34,3
        //2,3,12,34,54
        //부분정렬
        //삽입정렬
        //n=배열의 갯수
        //gap=총갯수 /2
        //1단계 gap=2   (0,2) ,(1,3) ,(2,4)       정렬된 상태 [12,2,3,34,54]
        //2단계 gap=1   (0,1),(1,2),(2,3),(3,4)
        //[12,2,3,34,54] (12,2)-->교환  2,12,3,34,54  ***** 0,1을 비교
        //[12,2,3,34,54] (12,3)-->교환  2,3,12,34,54  ***** 1,2를 비교
        //[12,2,3,34,54] (12,34)-->교환  2,3,12,34,54  ***** 2,3를 비교
        //[12,2,3,34,54] (34,54)-->교환  2,3,12,34,54  ***** 3,4를 비교

        //반복흐름 for
        //반복순서   gap값   조건검사  다음gap계산
        // 1         2     2>0    gab/=2    --->1
        // 2         1     1>0    gab/=2    --->0
        // 3         0     0>0
        int n=array.length;
        //{12, 34, 54, 2, 3}
        for (int gab = n/2; gab > 0; gab/=2) { // 0=1/2
            //1단계 gap=2   (0,2) ,(1,3) ,(2,4)       정렬된 상태 [12,2,3,34,54]
            for(int i=gab; i<n; i++) { //2
                int temp=array[i];


            }

        }








    }
    public static void main(String[] args) {
        int[] array = {12, 34, 54, 2, 3};
        System.out.println("SellSort Before");
        printArray(array);
        System.out.println("SellSort After");
        printArray(array);

    }
}
