package com.company.notes.DP.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 동전 2
 * */
public class BOJ2294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int[] dp = new int[k + 1];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i <= k; i++) {
            dp[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                if (coin[i] == j) {
                    dp[j] = 1;
                } else if (dp[j - coin[i]] != -1) {
                    if (dp[j] != -1) dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
                    else dp[j] = dp[j - coin[i]] + 1;
                }
            }
        }
        System.out.print(dp[k]);
    }
}
