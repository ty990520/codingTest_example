package com.company.swea.d2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1976 {
    static int m = 0, h = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            m = m1 + m2;
            h = h1 + h2;
            isMinuteOver60();
            isHourOver12();
            System.out.println("#" + tc + " " + h + " " + m);
            m = 0;
            h = 0;
        }
    }

    private static void isHourOver12() {
        if (h > 12) h = h - 12;
    }

    private static void isMinuteOver60() {
        if (m >= 60) {
            m -= 60;
            h++;
        }
    }
}
