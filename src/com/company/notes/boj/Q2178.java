package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
    static int n, m;
    static int dirX[] = {0, 0, -1, 1};      //상하좌우
    static int dirY[] = {-1, 1, 0, 0};      //상하좌우
    private static Integer[][] arr;
    private static boolean[][] visited;
    static int nowX, nowY;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());

        arr = new Integer[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        bfs(0, 0);
        System.out.println(arr[n-1][m-1]);

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
                if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < m) {
                    if (!visited[nowX][nowY] && arr[nowX][nowY] == 1) {
                        visited[nowX][nowY] = true;
                        arr[nowX][nowY] = arr[poll[0]][poll[1]] + 1; //지나온 depth값 저장
                        queue.offer(new int[]{nowX, nowY});
                    }
                }

            }
        }
        visited[i][j] = true;
    }

}
