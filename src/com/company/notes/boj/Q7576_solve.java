package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576_solve {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int nowX, nowY;
    static int n, m;
    static int[][] map;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        m = Integer.parseInt(stringTokenizer.nextToken());
        n = Integer.parseInt(stringTokenizer.nextToken());

        map = new int[n][m];


        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (map[i][j] == 1) {
                    queue.offer(new int[]{i, j});   //따로따로 수행시키는게 아니라 한번에 큐에 넣고 같이 돌리기
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                nowX = poll[0] + dx[i];
                nowY = poll[1] + dy[i];
                if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < m) {
                    if (map[nowX][nowY] == 0) {
                        map[nowX][nowY] = map[poll[0]][poll[1]] + 1;
                        queue.offer(new int[]{nowX, nowY});
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        if (checkZero()) {
            return -1;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (max < map[i][j]) {
                        max = map[i][j];
                    }
                }
            }

            return max - 1;
        }

    }

    private static boolean checkZero() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0)
                    return true;
            }
        }
        return false;
    }
}
