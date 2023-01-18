package com.company.notes.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] pSum = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                int num = Integer.parseInt(st.nextToken());
                pSum[i][j] = pSum[i][j - 1] + pSum[i - 1][j] - pSum[i - 1][j - 1] + num;
            }
        }

        int k = Integer.parseInt(br.readLine());//합을 구할 부분의 개수
        for (int a = 0; a < k; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int answer = pSum[x][y] - pSum[i - 1][y] - pSum[x][j - 1] + pSum[i - 1][j - 1];
            System.out.println(answer);
        }
    }
}
