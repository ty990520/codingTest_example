package com.company.notes.DFS;

import java.util.Scanner;

public class Inf8_2 {
    static int c, n;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Inf8_2 test = new Inf8_2();

        Scanner scan = new Scanner(System.in);
        c = scan.nextInt();
        n = scan.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        test.dfs(0,0);

        System.out.println(answer);
    }

    public static void dfs(int level, int sum) {
        if (sum > c) {
            answer = Math.max(answer, sum - arr[level - 1]);
            return;
        }
        if (sum == c) {
            answer = sum;
            return;
        }
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(level+1, sum+arr[level]);
            dfs(level+1, sum);
        }

    }
}
