package com.multi.basic;

import java.util.Scanner;
//최댓값,최솟값,평균값,평균보다 높은키의 갯수 ,평균보다 낮은 키의 갯수
public class ArrayEx1 {
    public static int maxHeight(int []height) {
        int max = height[0];
        for(int h:height){
            if(h>max){
                max = h;
            }
        }
        return max;
    }
    public static int minHeight(int []height) {
        return 0;
    }
    public static double avgHeight(int []height) {
        return 0;
    }
    public int avgCount(int []height,int state) {
        return 0;
    }
    public void createArray(int []height) {
    }
    public static void main(String[] args) {

    }
}
