package com.company.notes.DP.boj;

import java.util.Scanner;

public class BOJ1463 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int min = dp[i - 1] + 1;
            if (i % 3 == 0) {
                min = Math.min(min, dp[i / 3] + 1);
            }
            if (i % 2 == 0) {
                min = Math.min(min, dp[i / 2] + 1);
            }
            dp[i] = min;
        }
        System.out.println(dp[n]);
    }
}
