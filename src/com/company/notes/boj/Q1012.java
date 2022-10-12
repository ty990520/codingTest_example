package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1012 {
    static int n, m;
    static int dirX[] = {0, 0, -1, 1};      //상하좌우
    static int dirY[] = {-1, 1, 0, 0};      //상하좌우
    static Integer[][] arr;
    static boolean[][] visited;
    static int nowX, nowY;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test = 0; test < t; test++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            m = Integer.parseInt(stringTokenizer.nextToken());
            n = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());

            arr = new Integer[m][n];
            visited = new boolean[m][n];

            for (int i = 0; i < arr.length; i++) {
                Arrays.fill(arr[i], 0);
            }

            for (int i = 0; i < k; i++) {
                stringTokenizer = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(stringTokenizer.nextToken());
                int y = Integer.parseInt(stringTokenizer.nextToken());
                arr[x][y] = 1;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {
                        cnt++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(cnt);
            cnt=0;
        }

    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) {
                nowX = poll[0] + dirX[k];
                nowY = poll[1] + dirY[k];
                if (nowX >= 0 && nowX < m && nowY >= 0 && nowY < n) {
                    if (!visited[nowX][nowY] && arr[nowX][nowY] == 1) {
                        visited[nowX][nowY] = true;
                        queue.offer(new int[]{nowX, nowY});
                    }
                }
            }
        }
    }
}
