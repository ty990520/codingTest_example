package com.company.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1983_v2 {
    static String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= N; tc++) {
            st = new StringTokenizer(br.readLine(), " ");

            int cnt = Integer.parseInt(st.nextToken());
            int stunum = Integer.parseInt(st.nextToken());
            double find_score = 0;
            Double[] student = new Double[cnt];

            for (int i = 0; i < cnt; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                double mid = (0.35 * Integer.parseInt(st.nextToken()));
                double fin = (0.45 * Integer.parseInt(st.nextToken()));
                double hw = (0.20 * Integer.parseInt(st.nextToken()));
                student[i] = mid + fin + hw;
                if (i == stunum - 1) find_score = mid + fin + hw;

            }
            Arrays.sort(student, Collections.reverseOrder());

            int index = cnt / 10;
            int find = 0;

            for (int i = 0; i < cnt; i++) {
                if (student[i] == find_score) {
                    sb.append("#").append(tc).append(" ").append(score[find]).append("\n");
                    break;
                }
                index--;
                if (index == 0) {
                    find++;
                    index = cnt / 10;
                }
            }
        }
        System.out.println(sb);
    }
}
