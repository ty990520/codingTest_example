package com.company.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            int[] origin = new int[n];
            int[] neighbor = new int[n];
            String[] split = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                origin[i] = Integer.parseInt(split[i]);
            }
            if (n <= 4) {
                System.out.println("#" + tc + " 0");
                continue;
            }
            for (int i = 2; i < n - 2; i++) {
                int max1 = Math.max(origin[i - 2], origin[i - 1]);
                int max2 = Math.max(origin[i + 1], origin[i + 2]);
                neighbor[i] = Math.max(max1, max2);
            }
            for (int i = 2; i < n - 2; i++) {
                if (origin[i] > neighbor[i]) {
                    result += origin[i] - neighbor[i];
                }
            }
            System.out.println("#" + tc + " "+result);
        }

    }
}
