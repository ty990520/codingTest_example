package com.company.notes.DP.boj;

import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }
        arr[3] = 1;
        if (n >= 5) {
            arr[5] = 1;
        }
        if (n >= 6) {
            for (int i = 6; i <= n; i++) {
                int a = arr[i - 3];
                int b = arr[i - 5];
                if (a != -1 && b != -1) {
                    arr[i] = Math.min(a + 1, b + 1);
                } else if (a == -1 && b == -1) {
                    arr[i] = -1;
                } else if (a == -1) {
                    arr[i] = b + 1;
                } else if (b == -1) {
                    arr[i] = a + 1;
                }
            }
        }
        System.out.println(arr[n]);
    }
}
