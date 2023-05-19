package com.company.swea.d3;

import java.util.Scanner;


/* long 자료형 잘 쓰기..  */
public class Q1491 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            long answer = Long.MAX_VALUE;
            long n = scan.nextInt();  //타일 수
            long a = scan.nextInt();  //가중치
            long b = scan.nextInt();  //가중치

            for (long r = 1; r <= n; r++) {
                for (long c = r; r*c <= n ; c++) {
                    long exp = a * Math.abs(r - c) + b * (n - r * c);
                    answer = Math.min(answer, exp);
                }
            }
            System.out.println("#" + tc + " " + answer);
        }
    }
}
