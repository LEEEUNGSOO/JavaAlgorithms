package com.multi.basic;

import java.util.Scanner;

public class SourceCodeMedian {
    static int med3(int a, int b, int c) {
// 30  15  20  a보다 작고 c보다는 큰값
        // 1) a가 b보다 크거나 같을 때
        if (a >= b) {
            // b가 c보다 크거나 같으면 a ≥ b ≥ c → 중앙값은 b
            if (b >= c) return b;
                // a ≤ c이면 c ≥ a ≥ b → 중앙값은 a (a가 b보다 크면 이라는 조건이면서 a <=c 보다 작다면 중앙값은 a)
            else if (a <= c) return a;
                // 그 외에는 b < c < a → 중앙값은 c
            else return c;
        }
        // 2) a < b일 때
        else {
            // a가 c보다 크면 c < a < b → 중앙값은 a
            if (a >= c) return a;
                // b가 c보다 크면 a < c < b → 중앙값은 c
            else if (b >= c) return c;
                // 그 외에는 a < b ≤ c → 중앙값은 b
            else return b;
        }
    }
    static int med4(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        return a + b + c - max - min;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c 값 : ");
        int c = stdIn.nextInt();
        System.out.println("중앙값은 " + med4(a, b, c) + "입니다.");

    }
}
