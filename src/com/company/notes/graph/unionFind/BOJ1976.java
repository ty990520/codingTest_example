package com.company.notes.graph;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1976 {
    static int[] parents;
    static int[] path;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        parents = new int[n + 1];
        path = new int[m];
        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    union(i, j);
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            path[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findSamePath() ? "YES" : "NO");
    }

    private static boolean findSamePath() {
        for (int i = 1; i < path.length; i++) {
            if (find(path[i - 1]) != find(path[i])) {
                return false;
            }
        }
        return true;
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parents[b] = a;
        }
    }

    private static int find(int n) {
        if (n == parents[n]) {
            return n;
        }
        return parents[n] = find(parents[n]);
    }
}
