package com.company.notes.DFS.inf;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inf8_5 {
    static int n, m;
    static Integer[] arr;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Inf8_5 test = new Inf8_5();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = scan.nextInt();

        test.dfs(0, 0);

        System.out.println(answer);
    }

    public static void dfs(int sum, int cnt) {
        if (sum > m) {
            return;
        }
        if (cnt >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, cnt);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(sum + arr[i], cnt + 1);
            }
        }
    }
}
