package com.company.swea.d3;

import java.io.*;

public class Q2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());    //n은 항상 홀수
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(str.charAt(j) + "");
                }
            }
            int area = 1;
            int left = n / 2;
            int answer = arr[0][n / 2];
            for (int i = 1; i < n; i++) {
                if (i <= n / 2) {
                    area += 2;
                    left--;
                } else {
                    area -= 2;
                    left++;
                }
                int cnt = left;
                for (int j = 0; j < area; j++) {
                    answer += arr[i][cnt++];
                }
            }
            bw.write("#" + tc + " " + answer);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
