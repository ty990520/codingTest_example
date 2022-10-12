//package com.company.notes.boj;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
///*
//* 시간초과........
//* */
//public class Q7576 {
//    static int m, n;
//    static int[][] arr;
//    static boolean[][] visited;
//    static int dirX[] = {0, 0, -1, 1};      //상하좌우
//    static int dirY[] = {1, -1, 0, 0};      //상하좌우
//    static int nowX, nowY;
//
//    public static void main(String[] args) throws IOException {
//        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
//        m = Integer.parseInt(stringTokenizer.nextToken());
//        n = Integer.parseInt(stringTokenizer.nextToken());
//
//        arr = new int[n][m];
//        visited = new boolean[n][m];
//
//        for (int i = 0; i < n; i++) {
//            stringTokenizer = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
//            }
//        }
//
//
//        int result = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (!visited[i][j] && arr[i][j] == 1) {
//                    result = Math.min(bfs(i, j), result);
//                }
//            }
//        }
//
//        boolean isZero = false;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == 0) {
//                    isZero = true;
//                    break;
//                }
//            }
//        }
//
//        if (isZero) System.out.println(-1);
//        else System.out.println(result - 1);
//
//
//        br.close();
//    }
//
//    private static int bfs(int i, int j) {
//        int max = Integer.MIN_VALUE;
//        Queue<int[]> queue = new LinkedList<>();
//        queue.offer(new int[]{i, j});
//        visited[i][j] = true;
//
//        while (!queue.isEmpty()) {
//            int[] poll = queue.poll();
//
//            for (int k = 0; k < 4; k++) {
//                nowX = poll[0] + dirX[k];
//                nowY = poll[1] + dirY[k];
//                if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < m) {
//                    if (!visited[nowX][nowY] && arr[nowX][nowY] != -1 && arr[nowX][nowY] != 1) {
//                        visited[nowX][nowY] = true;
//                        if (arr[nowX][nowY] == 0) {
//                            arr[nowX][nowY] = arr[poll[0]][poll[1]] + 1;
//                        } else {
//                            arr[nowX][nowY] = Math.min(arr[poll[0]][poll[1]] + 1, arr[nowX][nowY]);
//                        }
//                        max = Math.max(max, arr[nowX][nowY]);
//                        queue.offer(new int[]{nowX, nowY});
//
//                    }
//                }
//            }
//        }
//        visited = new boolean[n][m];
//        return max;
//    }
//}
