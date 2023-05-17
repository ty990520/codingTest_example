package com.company.swea.d2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1948 {
    final static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int result = 0;
            if (m1 != m2) {
                m2--;
                while (m2 >= m1) {
                    result += days[m2 - 1];
                    m2--;
                }

            }
            result += d2 - d1 + 1;
            System.out.println("#" + tc + " " + result);
        }
    }
}
