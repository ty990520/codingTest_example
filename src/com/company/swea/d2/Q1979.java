//package com.company.swea.d2;
//
//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Q1979 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int t = Integer.parseInt(br.readLine());
//        for (int tc = 1; tc <= t; tc++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int k = Integer.parseInt(st.nextToken());
//
//            Integer[][] arr = new Integer[n][n];
//            for (int i = 0; i < n; i++) {
//                st = new StringTokenizer(br.readLine());
//                for (int j = 0; j < n; j++) {
//                    arr[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (arr[i][j] == 1) {
//                        dfs( i, j);
//                    }
//
//                }
//            }
//            for (boolean[] booleans : visited) {
//                for (boolean b : booleans) {
//                    System.out.print(b + " ");
//                }
//                System.out.println();
//
//            }
//        }
//
//    }
//
//}
