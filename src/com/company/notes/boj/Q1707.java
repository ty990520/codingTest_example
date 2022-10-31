package com.company.notes.boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1707 {
    static int k, v, e;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] group;
    static boolean isBinary;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            v = scan.nextInt();
            e = scan.nextInt();
            graph = new ArrayList[v + 1];
            group = new int[v + 1];
            visited = new boolean[v + 1];
            isBinary = true;

            for (int j = 1; j <= v; j++) {
                graph[j] = new ArrayList<>();
            }

            for (int j = 0; j < e; j++) {
                int s = scan.nextInt();
                int e = scan.nextInt();
                graph[s].add(e);
                graph[e].add(s);
            }

            for (int j = 1; j <= v; j++) {
                if (isBinary) {
                    dfs(j);
                } else break;
            }

            if (isBinary) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static void dfs(int node) {
        visited[node] = true;

        for (int i : graph[node]) {
            if (!visited[i]) {
                group[i] = (group[node] + 1) % 2;
                dfs(i);
            } else if (group[i] == group[node]) {
                isBinary = false;
            }
        }
    }
}
