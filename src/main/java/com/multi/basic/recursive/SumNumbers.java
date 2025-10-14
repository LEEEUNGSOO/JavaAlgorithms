package com.multi.basic.recursive;


import java.util.Scanner;

public class SumNumbers {
    public static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n=scanner.nextInt();
        int result = sum(n);
        System.out.println("1부터 " + n + "까지의 합은 " + result + "입니다.");
        scanner.close();
    }
}
//첫번때 sum(3) ---> n+sum(n-1)  --> 3+sum(2)
//두번째 sum(2)--------------------->2+sum(1)
//세번째 sum(1)--------------------->1+sum(0)
//네번째 sum(0)  n==0 retrun 0
