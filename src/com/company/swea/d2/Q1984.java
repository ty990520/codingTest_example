package com.company.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int n = Integer.parseInt(st.nextToken());
                sum += n;
                list.add(n);
            }
            Integer max = Collections.max(list);
            Integer min = Collections.min(list);
            int result = (int) Math.round((double) (sum - max - min) / 8);
            System.out.println("#" + tc + " " + result);
        }
    }
}
