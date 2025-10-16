package com.multi.basic.sort;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortNonRecursive {

    public static void quickSort(int []array){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0,array.length-1});
        System.out.println("\n=== 퀵 정렬 시작 ===");
        System.out.println("초기 배열: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int []array={5, 3, 8, 4, 9, 1, 6, 2, 7};//

    }
}
