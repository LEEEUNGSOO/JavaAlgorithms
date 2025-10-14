package com.multi.basic.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    static  int binSearch(int []a,int n,int key){
        int pl=0;//pointleft
        int pr=n-1;//pointright
        do {
            int pc = (pl + pr) / 2;//중앙 요소의 index
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }while(pl<=pr);
       return -1;
    }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.println("요솟수:");
        int num=stdIn.nextInt();
        int []x=new int[num];//num 크기만큼 배열생성
        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0]:");
        x[0]=stdIn.nextInt();
        for(int i=1;i<num;i++){
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            }while(x[i]<x[i-1]);
        }
       // System.out.println(Arrays.toString(x));
        System.out.println("검색할 값:");
        int ky=stdIn.nextInt();
        int idx=binSearch(x,num,ky);
        if(idx==-1){
            System.out.println("검색값이 없습니다");
        }else{
            System.out.println("검색값은 x["+idx+"]");
        }


    }
}
