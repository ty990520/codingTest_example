package com.company.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q1244 {
    static int n;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            max = 0;
            String[] str = br.readLine().split(" ");
            String numbers = str[0];
            n = Integer.parseInt(str[1]);

            Set<String> memo = new HashSet<>();    // Memoization을 위해 추가

            dfs(numbers, 0, memo);

            System.out.println("#" + tc + " " + max);
        }
    }

    private static void dfs(String numbers, int cnt, Set<String> memo) {
        if (cnt == n) {
            max = Math.max(max, Integer.parseInt(numbers));
            return;
        }

        // Memoization을 사용하여 중복 작업 제거
        String key = numbers + "-" + cnt;
        if (memo.contains(key)) return;
        memo.add(key);    //방문배열과 같은 역할

        for (int i = 0; i < numbers.length() - 1; i++) {
            for (int j = i + 1; j < numbers.length(); j++) {
                dfs(swap(numbers, i, j), cnt + 1, memo);
            }
        }
    }

    private static String swap(String numbers, int i, int j) {
        StringBuilder sb = new StringBuilder(numbers);
        char tmp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, tmp);
        return sb.toString();
    }
}
