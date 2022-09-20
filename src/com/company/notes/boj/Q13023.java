package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q13023 {
    static ArrayList<Integer> arr[];
    static boolean visited[];
    static boolean arrive = false;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new ArrayList[n];
        visited = new boolean[n];


        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (arrive) break;
        }
        if (arrive) System.out.println("1");
        else System.out.println("0");
    }

    private static void dfs(int now, int depth) {
        if (depth == 5||arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for (int i : arr[now]) {
            if (!visited[i])
                dfs(i, depth+1);
        }
        visited[now] = false;   //계속 이어서 사용할 수 있도록 초기화시킴
    }
}
