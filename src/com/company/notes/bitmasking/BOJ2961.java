package com.company.notes.bitmasking;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2961 {
    static int[] sour, bitter;
    static int n, bitStr = 0;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        sour = new int[n + 1];
        bitter = new int[n + 1];
        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            sour[i] = Integer.parseInt(st.nextToken());
            bitter[i] = Integer.parseInt(st.nextToken());
        }
        int sTotal = 1, bTotal = 0;
        min = Math.abs(sour[1] - bitter[1]);
        recursion(1, sTotal, bTotal);
        System.out.println(min);
    }

    private static void recursion(int level, int sTotal, int bTotal) {
        if (level > 1) min = Math.min(min, Math.abs(sTotal - bTotal));
        if (level == n + 1) return;

        for (int i = 1; i <= n; i++) {
            if ((bitStr & (1 << i)) == 0) {
                bitStr |= 1 << i;
                recursion(level + 1, sTotal * sour[i], bTotal + bitter[i]);
                bitStr &= ~(1 << i);
            }
        }
    }
}
