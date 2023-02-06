package com.company.notes.DP.boj;

import java.util.Scanner;

public class BOJ2225 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[][] dp = new int[k + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            dp[1][i] = 1;
        }
        for (int i = 1; i <= k; i++) {
            dp[i][1] = i;
        }
        for (int i = 2; i <= k; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % 1000000000;
            }
        }
        System.out.println(dp[k][n]);
    }
}
