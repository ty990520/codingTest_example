package com.company.notes.boj;

import java.util.*;

public class Q1325 {
    static int n,m;
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] answer;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();

        arr = new ArrayList[n+1];
        answer = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            arr[start].add(end);
        }

        for (int i = 1; i <= n; i++) {
            if (!arr[i].isEmpty()) {
                visited = new boolean[n+1];
                bfs(i);
            }
        }


        int max=Integer.MIN_VALUE;
        for (int i = 1; i <=n; i++) {
            max = Math.max(max,answer[i]);
        }
        for (int i = 1; i <=n; i++) {
            if (max == answer[i]) {
                System.out.print(i+" ");
            }
        }

    }

    private static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            for (int x : arr[poll]) {
                if (!visited[x]) {
                    visited[x] = true;
                    answer[x]++;
                    queue.offer(x);
                }

            }
        }
    }
}
