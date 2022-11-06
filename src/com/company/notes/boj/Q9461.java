package com.company.notes.boj;

import java.util.Scanner;

public class Q9461 {
    static int[] tests;

    public static void solution(int max) {
        long arr[] = new long[max];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < max; i++) {
            arr[i]=arr[i-3]+arr[i-2];
        }

        for (int i : tests) {
            System.out.println(arr[i-1]);
        }

    }

    public static void main(String[] args) {
        Q9461 T = new Q9461();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        tests = new int[t];
        int max=Integer.MIN_VALUE;      //가장 큰 값을 먼저 수행해서 메모라이징
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            tests[i] = n;
            max = Math.max(max, n);
        }
        T.solution(max);
    }
}
