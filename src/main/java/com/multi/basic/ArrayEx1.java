package com.multi.basic;

import java.util.ArrayList;
import java.util.Scanner;
//최댓값,최솟값,평균값,평균보다 높은 키의 갯수 ,평균보다 낮은 키의 갯수
public class ArrayEx1 {
    public static int getMaxHeight(int []height) {
        int max = height[0];
        for(int h:height){
            if(h>max){
                max = h;
            }
        }
        return max;
    }
    public static int getMinHeight(int []height) {
        int min = height[0];
        for(int h:height){
            if(h<min){
                min= h;
            }
        }
        return min;

    }
    public static double getAvgHeight(int []height) {
        double sum = 0;
        for(int h:height){
            sum += h;
        }
        return sum/height.length;
    }
    //평균키보다 높은 키의 개수
    public static int getCountAboveAbverage(int state,int []height) {
        int count=0;
        double avg=getAvgHeight(height);
        for(int h:height){
            if(state==1&&h>avg){
                count++;
            }
            else if(state==2&&h<avg){
                count++;
            }
        }
        return count;
    }
//    //평균키보다 낮은  키의 개수
//    public static int getCountLowerAverage(){
//        return 0;
//    }

    public static void main(String[] args) {
      int []height={150,180,190,188,178,182,179,199};
        System.out.println("최댓값"+getMaxHeight(height));
        System.out.println("최솟값"+getMinHeight(height));
        System.out.println("평균키"+getAvgHeight(height));
        System.out.println("평균보다  큰 키 개수 :"+getCountAboveAbverage(1,height));
        System.out.println("평균보다 작은 키 개수:"+getCountAboveAbverage(2,height));

    }
}
