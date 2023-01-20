package com.company.notes.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11441 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pSum = new int[n+1];
        for (int i = 1; i <=n; i++) {
            pSum[i]=pSum[i-1]+Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(pSum[j]-pSum[i-1]);;
        }
    }
}
