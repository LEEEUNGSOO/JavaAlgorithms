package com.multi.basic.sort;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortNonRecursive {


    //[5, 3, 8, 4, 9, 1, 6, 2, 7]
    public static int partition(int []array,int low,int high){
        int pivot = array[high];//7
        int i=low-1;//혹시 피벗값 보다 작으면 i++  초기값 =-1
        System.out.println("\n==============================");
        System.out.println("partition 호출: low=" + low + ", high=" + high);
        System.out.println("피벗 값(pivot) = " + pivot);
        System.out.println("초기 배열: " + Arrays.toString(array));
        System.out.println("==============================");
        for(int j=low;j<high;j++){
            System.out.printf("j=%d, array[j]=%d  | 비교: %d < %d ? ", j, array[j], array[j], pivot);

        }


        return i;// i는  피벗이 들어갈 index

    }
    public static void quickSort(int []array){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0,array.length-1});//배열의  stack=[[0,8]]
        System.out.println("\n=== 퀵 정렬 시작 ===");
        System.out.println("초기 배열: " + Arrays.toString(array));
        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int low = range[0];
            int high = range[1];

            if (low < high) {//{5, 3, 8, 4, 9, 1, 6, 2, 7};
                int pivotIndex = 0;//partition(array, low, high);

                // 🔹 상태 출력

            }
        }

        System.out.println("\n=== 정렬 완료 ===");
        System.out.println("최종 결과: " + Arrays.toString(array));
    }

    //Stack상태를 보기좋게 문자열로...
    public static String stackToString(Stack<int[] >stack){
        if(stack.isEmpty()){ return "[]"; }
        StringBuilder sb = new StringBuilder();
        for(int []raange : stack){
            sb.append(Arrays.toString(raange)).append(" ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int []array={5, 3, 8, 4, 9, 1, 6, 2, 7};
        quickSort(array);
//        int []m={0,8};
//        System.out.println(m[0]+" "+m[1]);
       // System.out.println(new int[]{10,20,30,40}[0]);
        //System.out.println(new int[]{10,20,30,40}[1]);


    }
}
