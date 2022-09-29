package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260 {
    static boolean visited[];   //방문배열 필요
    static ArrayList<Integer>[] arr;    //그래프 데이터 저장 인접 리스트

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int v = Integer.parseInt(stringTokenizer.nextToken());  //탐색 시작 번호

        arr = new ArrayList[n + 1];


        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            arr[s].add(e);
            arr[e].add(s);
        }

        //번호가 작은 것을 먼저 방문하기로 했기 때문에 오름차순 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();

        visited = new boolean[n + 1];
        bfs(v);

        br.close();
    }

    private static void dfs(int v) {    //재귀호출 사용
        System.out.print(v+" ");
        visited[v] = true;
        for (int i : arr[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {    //큐 사용
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            System.out.print(poll+" ");
            for (int i : arr[poll]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }


}
