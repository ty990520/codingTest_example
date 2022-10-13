package com.company.notes.boj;

import java.util.*;

public class Q18352 {
    static int n, m, k, x;
    static ArrayList<Integer>[] graph;
    static List<Integer> answer;
    static int[] visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        k = scan.nextInt();
        x = scan.nextInt();

        graph = new ArrayList[n + 1];
        answer = new ArrayList<>();
        visited = new int[n + 1];

        /* 초기화 */
        for (int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n + 1; i++) {
            visited[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();

            graph[start].add(end);
        }


        bfs(x);

        for (int i = 1; i < n+1; i++) {
            if (visited[i] == k) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(answer);
            for (Integer i : answer) {
                System.out.println(i);
            }
        }

    }

    private static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visited[x] = 0;  //시작하는 노드는 거리값 0

        while (!queue.isEmpty()) {
            int poll = queue.poll();


            for (Integer i : graph[poll]) {
                if (visited[i] == -1) {  //아직 방문하지 않은 노드
                    visited[i] = visited[poll] + 1;
                    queue.offer(i);
                }
            }
        }
    }
}
