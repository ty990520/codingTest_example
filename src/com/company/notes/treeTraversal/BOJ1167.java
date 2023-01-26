//package com.company.notes.treeTraversal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class BOJ1167 {
//    static ArrayList<Integer>[] arr;
//    //배열 인덱스는 노드 번호, 배열 안의 값은 연결된 엣지노드
//    boolean visited[];
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int v = Integer.parseInt(br.readLine());
//        arr = new ArrayList[v+1];
////        visited = new boolean[v+1];
//        StringTokenizer st;
//
//        for (int i = 1; i <= v; i++) {
//            st = new StringTokenizer(br.readLine());
//            while (st.hasMoreTokens()) {
//                if (st.nextToken().equals("-1")) {
//                    int node = Integer.parseInt(st.nextToken());
//                    int len = Integer.parseInt(st.nextToken());
//                    new Node(node, len);
//                }
//            }
//
//        }
//        int n = Integer.parseInt(st.nextToken());
//
//        ArrayList<Integer>[] arr;
//        arr = new ArrayList[n + 1];
//    }
//
//    static class Node {
//        Node node;
//        int len;
//
//        Node(Node node, int len) {
//            this.node = node;
//            this.len = len;
//        }
//    }
//}
