package com.company.notes.bitmasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 비트마스킹 사용 */

public class BOJ15661 {
    static int[][] arr;
    static int n;
    static ArrayList<Integer> start, link;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());    /* N(4 ≤ N ≤ 20) */
        StringTokenizer st;
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        pickMemberWithBit();
        System.out.println(min);

    }

    public static void pickMemberWithBit() {
        for (int bit = 1; bit < (1 << n) - 1; bit++) {
            start = new ArrayList();
            link = new ArrayList();
            for (int i = 0; i < n; i++) {
                if ((bit & (1 << i)) !=0) start.add(i);
                else link.add(i);
            }

            compareMin();
        }
    }

    public static void compareMin() {
        int totalStart = 0, totalLink = 0;
        for (int i = 0; i < start.size(); i++) {
            for (int j = 0; j < start.size(); j++) {
                totalStart += arr[start.get(i)][start.get(j)];
            }
        }
        for (int i = 0; i < link.size(); i++) {
            for (int j = 0; j < link.size(); j++) {
                totalLink += arr[link.get(i)][link.get(j)];
            }
        }
        min = Math.min(min, Math.abs(totalStart - totalLink));
    }

}
