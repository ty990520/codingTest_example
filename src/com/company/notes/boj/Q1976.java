//package com.company.notes.boj;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Q1976 {
//    static int n, m;
//    static ArrayList<Integer>[] graph;
//    static int[] parent;
//    static List<Integer> route;
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        m = scan.nextInt();
//
//        graph = new ArrayList[n + 1];
//        parent = new int[n + 1];
//        route = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//            parent[i] = i;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (scan.nextInt() == 1) {
//                    union(i,j);
//                    graph[i].add(j);
//                    graph[j].add(i);
//                }
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            route.add(scan.nextInt());
//        }
//
//
//    }
//
//    private static void union(int a, int b) {
//            find(a);
//    }
//
//}
