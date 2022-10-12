package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q24479 {
    static int n, m, r;
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] visitedSeq;
    static int nowSeq;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        r = Integer.parseInt(stringTokenizer.nextToken());

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        visitedSeq = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 1; i <= m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            arr[s].add(e);
            arr[e].add(s);

        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        nowSeq = 1;
        visitedSeq[r] = 1;
        visited[r] = true;
        dfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) sb.append(visitedSeq[i]).append('\n');
        System.out.print(sb);
        br.close();
    }

    private static void dfs(int r) {
        if(arr[r].size()==0) return;

        for (int i : arr[r]) {
            if (!visited[i]) {
                nowSeq++;
                visitedSeq[i] = nowSeq;
                visited[i] = true;
                dfs(i);
            }
        }
    }
}
