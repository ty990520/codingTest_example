package com.company.notes.treeTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);      /*입력으로 주어지는 간선은 양방향이다.*/
        }
        for (int i = 1; i <= n; i++) {
            /*방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문*/
            Collections.sort(arr[i]);
        }

        visited[v] = true;
        System.out.print(v + " ");
        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);
    }

    public static void dfs(int v) {
        if (arr[v].size() == 0) return;

        for (int i : arr[v]) {
            if (!visited[i]) {
                visited[i] = true;
                System.out.print(i + " ");
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            System.out.print(poll + " ");
            for (int i : arr[poll]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);

                }
            }
        }
    }
}
