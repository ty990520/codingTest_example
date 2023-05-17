package com.company.swea.d2;

import java.io.*;

/**
 * 소수가 이미 주어져있기 때문에 에라토스테네스의 체를 쓰지 않아도 됨
 */
public class Q1945 {
    final static int[] DECIMAL = {2, 3, 5, 7, 11};
    final static int SIZE = DECIMAL.length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] result = new int[SIZE];
            for (int i = 0; i < SIZE; i++) {
                while (n % DECIMAL[i] == 0) {
                    n/=DECIMAL[i];
                    result[i]++;
                }
            }

            bw.write("#" + tc + " ");
            for (int i : result) {
                bw.write(i+" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
