package com.company.notes.treeTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ24479 {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] visitedSeq;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        visitedSeq = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }

        /* 정점 번호를 오름차순으로 방문 */
        for (int i = 1; i <=n; i++) {
            Collections.sort(arr[i]);
        }

        cnt = 1;
        visitedSeq[r] = cnt;
        visited[r] = true;
        dfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.println(visitedSeq[i]);
        }
    }

    public static void dfs(int r) {
        if (arr[r].size() == 0) return;

        for (int i : arr[r]) {
            if (!visited[i]) {
                visitedSeq[i] = ++cnt;
                visited[i] = true;
                dfs(i);
            }
        }

    }
}
