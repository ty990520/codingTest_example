package com.company.notes.boj;

import java.io.IOException;
import java.util.*;

public class Q1167 {
    static ArrayList<Edge> arr[];
    static boolean visited[];
    static int totalDepth[];

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        arr = new ArrayList[v + 1];
        visited = new boolean[v + 1];
        totalDepth = new int[v + 1];

        for (int i = 1; i <= v; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < v; i++) {
            int s = scan.nextInt();
            while (true) {
                int e = scan.nextInt();
                if (e == -1) {
                    break;
                }
                int w = scan.nextInt();
                arr[s].add(new Edge(e, w));
            }
        }

        int maxNode = 1;
        int maxVal = 0;
        bfs(2);   //임의의 시작지점

        for (int i = 1; i <= v; i++) {
            if (totalDepth[i] > maxVal) {
                maxVal = totalDepth[i];
                maxNode = i;
            }
        }

        maxVal = 0;
        //다시 초기화
        visited = new boolean[v + 1];
        totalDepth = new int[v + 1];
        bfs(maxNode);

        for (int i = 1; i <= v; i++) {
            if (totalDepth[i] > maxVal) {
                maxVal = totalDepth[i];
                maxNode = i;
            }

        }
        System.out.println(maxVal);
    }

    public static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (Edge edge : arr[poll]) {
                if (!visited[edge.e]) {
                    visited[edge.e] = true;
                    totalDepth[edge.e] = totalDepth[poll] + edge.val;
                    queue.offer(edge.e);
                }
            }
        }
    }
}

class Edge {
    int e;
    int val;

    public Edge(int e, int val) {
        this.e = e;
        this.val = val;
    }
}