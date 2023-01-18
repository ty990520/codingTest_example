package com.company.notes.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2559 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = k-1;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int max = sum;
        while (e < n - 1) {
            sum += arr[++e];
            sum -= arr[s++];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
