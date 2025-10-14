package com.multi.basic.recursive;
//3!=3*2*1
//5!=5*4*3*2*1
//0!=1
public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }//if
        int rs=n * factorial(n - 1);
        System.out.println("rs="+rs);
        return rs;
    }//factorialFunction

    public static void main(String[] args) {
        factorial(5);
        //int result=factorial(3);
       // System.out.println("Factorialresult="+result);
    }

}
