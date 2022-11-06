package com.company.notes.boj;

import java.util.Scanner;

public class Q1890 {
    static int n;
    static int[][] board;
    static long[][] dp;


    public static long solution() {
        dp[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int step = board[i][j];
                if (step == 0) continue;
                if (step + i <= n) {    //넘어가지 않는 경우
                    dp[step+i][j]+= dp[i][j];
                }
                if (step + j <= n) {
                    dp[i][step + j]+= dp[i][j];
                }
            }
        }

        return dp[n][n];
    }

    public static void main(String[] args) {
        Q1890 T = new Q1890();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        board = new int[n + 1][n + 1];
        dp = new long[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution());
    }
}
