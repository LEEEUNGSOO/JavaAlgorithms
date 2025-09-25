package com.multi.basic;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("층수를 입력하세요");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){ //행
            for(int j=1;j<=n;j++){//열 공백
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
