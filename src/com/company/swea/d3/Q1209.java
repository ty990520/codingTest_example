package com.company.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1209 {
    static final int SIZE = 100;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[SIZE][SIZE];
            initArr(br, arr);

            int max = findMaxAtLine(arr);
            max = Math.max(max, findMaxAtCross(arr));
            System.out.println("#" + n + " " + max);
        }
    }

    private static int findMaxAtCross(int[][] arr) {
        int sum = 0;
        int reverse = 0;
        for (int i = 0; i < SIZE; i++) {
            sum += arr[i][i];
            reverse += arr[i][SIZE - i - 1];
        }
        return Math.max(sum, reverse);
    }

    private static int findMaxAtLine(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < SIZE; i++) {
            int colSum = 0;
            int rowSum = 0;
            for (int j = 0; j < SIZE; j++) {
                colSum += arr[i][j];
                rowSum += arr[j][i];
            }
            max = Math.max(max, Math.max(colSum, rowSum));

        }
        return max;
    }

    private static void initArr(BufferedReader br, int[][] arr) throws IOException {
        for (int i = 0; i < SIZE; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
    }
}
