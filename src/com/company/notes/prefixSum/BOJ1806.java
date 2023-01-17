package com.company.notes.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//투포인터+구간합
public class BOJ1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1]; //마지막은 공백으로 놔둠
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        int r = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (l <= n && r <= n) {
            if (sum >= s)
                min = Math.min(min, r - l);
            if (sum < s) sum += arr[r++];
            else sum -= arr[l++];
        }
        if (min == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(min);

    }
}
