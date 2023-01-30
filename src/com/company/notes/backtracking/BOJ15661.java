package com.company.notes.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 백트래킹 사용 - 모르겠다 왜 틀렸ㅈㅣ.... */
public class BOJ15661 {
    static int[][] arr;
    static boolean[] checked;
    static int n;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());    /* N(4 ≤ N ≤ 20) */
        StringTokenizer st;
        arr = new int[n + 1][n + 1];
        checked = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i <n; i++) {
            recursion(1, 1);
        }

        System.out.println(min);
    }

    public static void recursion(int level, int startIndex) {
        if (level == n + 1) {
            compareTotal();
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            if (!checked[i]) {
                checked[i] = true;
                recursion(level + 1, i+1);
                checked[i] = false;
            }
        }
    }

    private static void compareTotal() {
        int totalStart = 0, totalLink = 0;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (checked[i] && checked[j]) {
                    totalStart += arr[i][j] + arr[j][i];
                } else if(!checked[i] && !checked[j]){
                    totalLink += arr[i][j] + arr[j][i];
                }
            }
        }
        min = Math.min(min, Math.abs(totalStart - totalLink));
    }
}
