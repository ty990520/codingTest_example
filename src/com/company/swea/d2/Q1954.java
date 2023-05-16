package com.company.swea.d2;

import java.io.*;

public class Q1954 {
    final static int[] dirX = {0, 1, 0, -1};
    final static int[] dirY = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            int i = 0, x = 0, y = 0, cnt = 1;
            while (cnt <= n * n) {
                arr[x][y] = cnt;
                if (!isValidArea(n, arr, i, x, y)) {
                    i++;
                }
                x += dirX[i % 4];
                y += dirY[i % 4];
                cnt++;
            }
            bw.write("#" + tc + "\n");
            for (int[] ints : arr) {
                for (int a : ints) {
                    bw.write(a + " ");
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

    private static boolean isValidArea(int n, int[][] arr, int i, int x, int y) {
        int newX = dirX[i % 4] + x;
        int newY = dirY[i % 4] + y;
        return newX >= 0 && newY >= 0 &&
                newX < n && newY < n &&
                arr[newX][newY] == 0;
    }
}
