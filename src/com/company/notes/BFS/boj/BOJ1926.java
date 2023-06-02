package com.company.notes.BFS.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 문제이름 : 그림
 * 알고리즘 분류 : 너비 우선 탐색
 * 메모리 : 50968KB
 * 시간 : 488ms
 */
public class BOJ1926 {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

    static int n, m, maxRange = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());   //세로
        m = Integer.parseInt(st.nextToken());   //가로

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;    //그림의 개수

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    bfs(new Integer[]{i, j});
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(maxRange);
    }

    private static void bfs(Integer[] site) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(site);
        int range = 1;

        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dirX[i];
                int y = poll[1] + dirY[i];
                if (x >= 0 && x < n && y >= 0 && y < m
                        && arr[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true;
                    queue.add(new Integer[]{x, y});
                    range++;
                }
            }
        }
        maxRange = Math.max(maxRange, range);
    }
}
