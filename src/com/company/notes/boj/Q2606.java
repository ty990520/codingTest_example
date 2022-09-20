package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2606 {
    static ArrayList<Integer> graph[];
    static boolean visited[];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        graph = new ArrayList[v + 1];
        visited = new boolean[v + 1];

        for (int i = 1; i <= v; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());

            graph[start].add(end);
            graph[end].add(start);
        }

        dfs(1);
        System.out.println(count-1);    //1번 컴퓨터는 제외


    }

    private static void dfs(int v) {
        if (visited[v])
            return;
        visited[v] = true;
        count++;
        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
