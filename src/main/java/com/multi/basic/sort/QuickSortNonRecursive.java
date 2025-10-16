package com.multi.basic.sort;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortNonRecursive {

    //
    public static void quickSort(int []array){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0,array.length-1});//배열의  stack=[[0,8]]
        System.out.println("\n=== 퀵 정렬 시작 ===");
        System.out.println("초기 배열: " + Arrays.toString(array));
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
