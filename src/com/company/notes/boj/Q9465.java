package com.company.notes.boj;

import java.util.Scanner;

public class Q9465 {
    static int[][] arr;
    static int[][] dp;
    static int n;

    public static int solution() {
        dp[0][1] = arr[0][1];
        dp[1][1] = arr[1][1];

        for (int i = 2; i <= n; i++) {
            dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + arr[0][i];
            dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + arr[1][i];
        }
        return Math.max(dp[0][n], dp[1][n]);
    }

    public static void main(String[] args) {
        Q9465 test = new Q9465();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            n = scan.nextInt();
            arr = new int[2][n + 1];
            dp = new int[2][n + 1];

            for (int j = 0; j <2; j++) {
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = scan.nextInt();
                }
            }

            System.out.println(test.solution());
        }

    }
}
