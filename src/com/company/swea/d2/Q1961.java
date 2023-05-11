package com.company.swea.d2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            bw.write("#"+tc+"\n");
            int n = Integer.parseInt(br.readLine());
            int[][] origin = makeOriginArr(br, n);
            int[][] rotation90 = makeRotationArr(n, origin);
            int[][] rotation180 = makeRotationArr(n, rotation90);
            int[][] rotation270 = makeRotationArr(n, rotation180);


            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb90 = new StringBuilder();
                StringBuilder sb180 = new StringBuilder();
                StringBuilder sb270 = new StringBuilder();
                appendStr(n, sb90, rotation90[i]);
                appendStr(n, sb180, rotation180[i]);
                appendStr(n, sb270, rotation270[i]);
                sb.append(sb90.toString()).append(" ").append(sb180.toString()).append(" ").append(sb270.toString());
                bw.write(sb.toString());
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

    private static void appendStr(int n, StringBuilder sb90, int[] rotation90) {
        for (int j = 0; j < n; j++) {
            sb90.append(rotation90[j]);
        }
    }

    private static int[][] makeRotationArr(int n, int[][] origin) {
        int[][] rotationArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotationArr[i][j] = origin[n - 1 - j][i];
            }
        }
        return rotationArr;
    }

    private static int[][] makeOriginArr(BufferedReader br, int n) throws IOException {
        int[][] origin = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                origin[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return origin;
    }
}
