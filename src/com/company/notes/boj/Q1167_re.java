//package com.company.notes.boj;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Q1167_re {
//    static int n;
//    static ArrayList<Edge2>[] edgeList;
//    static boolean[] visited;
//    static int max = Integer.MIN_VALUE;
//
//    public static int solution() {
//        int answer = 0; //max
//
//        for (int i = 1; i <= n; i++) {
//            bfs(i);
//            visited = new boolean[n + 1];
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Q1167_re T = new Q1167_re();
//
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        edgeList = new ArrayList[n + 1];
//        visited = new boolean[n + 1];
//
//        for (int i = 0; i <= n; i++) {
//            edgeList[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < n; i++) {
//            int index = scan.nextInt();
//            while (true) {
//                int vertex = scan.nextInt();
//                if (vertex == -1) {
//                    break;
//                }
//                int weight = scan.nextInt();
//                Edge2 edge = new Edge2(vertex, weight);
//                edgeList[index].add(edge);
//            }
//
//        }
//        System.out.println("answer : "+T.solution());
//    }
//
//    public static void bfs(int v) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(v);
//        visited[v] = true;
//
//        int temp = 0;
//        while (!queue.isEmpty()) {
//            Integer poll = queue.poll();
//            for (Edge2 i : edgeList[poll]) {
//                if()
//                if (!visited[i.vertex]) {
//                    temp = temp + i.weight;
//                    visited[i.vertex] = true;
//                    queue.add(i.vertex);
//                } else {
//                    System.out.println(">"+temp);
//                }
//            }
//        }
//        System.out.println("temp : "+temp);
//
////        max = Math.max(max, result);
//    }
//}
//
//class Edge2 {
//    int vertex;
//    int weight;
//
//    public Edge2(int vertex, int weight) {
//        this.vertex = vertex;
//        this.weight = weight;
//    }
//}