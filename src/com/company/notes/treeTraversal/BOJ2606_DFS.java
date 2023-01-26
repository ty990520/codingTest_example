package com.company.notes.treeTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2606_DFS {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }

        dfs(1);
        System.out.println(answer-1);
    }

    public static void dfs(int n) {
        if (visited[n]) return;
        visited[n] = true;
        answer++;

        for (int i : arr[n]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
