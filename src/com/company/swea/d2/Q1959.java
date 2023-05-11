package com.company.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            if (n == m) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i] * b[i];
                }
                System.out.println("#" + tc + " " + sum);
            } else {
                int max = Integer.MIN_VALUE;
                if (n < m) {
                    max = findMax(n, m, a, b, max);
                } else {
                    max = findMax(m, n, b, a, max);
                }
                System.out.println("#" + tc + " " + max);
            }
        }
    }

    private static int findMax(int n, int m, int[] a, int[] b, int max) {
        int last = n - 1;
        while (last <= m - 1) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i] * b[last - (n - 1 - i)];
            }
            max = Math.max(max, sum);
            last++;
        }
        return max;
    }
}
