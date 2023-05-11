package com.company.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1970_fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int[] cnt = new int[coin.length];
            int n = Integer.parseInt(br.readLine());
            int i = 0;
            while (n > 0) {
                if (n < coin[i]) {
                    i++;
                } else {
                    n = n - coin[i];
                    cnt[i]++;
                }
            }
            System.out.println("#" + tc);
            for (int answer : cnt) {
                System.out.print(answer + " ");
            }
            System.out.println();
        }
    }
}
