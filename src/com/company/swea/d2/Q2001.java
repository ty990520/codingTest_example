package com.company.swea.d2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 메모리 18,432 kb
 * 실행시간 107 ms
 */
public class Q2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = makeArr(br, n);
            int[][] sumArr = makeSumArr(n, arr);
            int max = findMax(n, m, sumArr);
            System.out.println("#" + i + " " + max);
        }

    }

    private static int findMax(int n, int m, int[][] sumArr) {
        int max = Integer.MIN_VALUE;

        for (int j = m - 1; j < n; j++) {
            for (int k = m - 1; k < n; k++) {
                int scope = 0;
                if (isFirstRow(m, j) && isFirstCol(m, k)) {
                    scope = sumArr[j][k] ;

                } else if (isFirstRow(m, j)) {
                    scope = sumArr[j][k]  - sumArr[j][k - m];

                } else if (isFirstCol(m, k)) {
                    scope = sumArr[j][k] - sumArr[j - m][k] ;

                } else {
                    scope = sumArr[j][k] - sumArr[j - m][k] - sumArr[j][k - m] + sumArr[j - m][k - m];
                }
                max = Math.max(max, scope);
            }
        }
        return max;
    }

    private static boolean isFirstCol(int m, int k) {
        return k == m - 1;
    }

    private static boolean isFirstRow(int m, int j) {
        return isFirstCol(m, j);
    }

    private static int[][] makeSumArr(int n, int[][] arr) {
        int[][] sumArr = new int[n][n];
        sumArr[0][0] = arr[0][0];
        for (int j = 1; j < n; j++) {
            sumArr[0][j] = sumArr[0][j - 1] + arr[0][j];
        }
        for (int j = 1; j < n; j++) {
            sumArr[j][0] = sumArr[j - 1][0] + arr[j][0];
        }

        for (int j = 1; j < n; j++) {
            for (int k = 1; k < n; k++) {
                sumArr[j][k] = sumArr[j][k - 1] + sumArr[j - 1][k] - sumArr[j - 1][k - 1]
                        + arr[j][k];
            }
        }
        return sumArr;
    }

    private static int[][] makeArr(BufferedReader br, int n) throws IOException {
        int[][] arr = new int[n][n];
        StringTokenizer st;
        for (int j = 0; j < n; j++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < n; k++) {
                arr[j][k] = Integer.parseInt(st.nextToken());
            }
        }
        return arr;
    }
}
