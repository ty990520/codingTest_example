package com.company.notes.boj;

import java.util.Scanner;

public class Q2579 {
    static int[] arr;
    static int[] dp;

    public static int solution() {

        dp[1] = arr[1];
        if (arr.length >= 3) {
            dp[2] = arr[1]+arr[2];
        }

        for (int i = 3; i < arr.length; i++) {
            dp[i] = Math.max(dp[i-2],dp[i-3]+arr[i-1])+arr[i];
        }

        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        Q2579 test = new Q2579();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        arr = new int[n+1];
        dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(test.solution());
    }
}
