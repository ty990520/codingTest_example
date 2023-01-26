package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4963 {
    static int dirX[] = {0, 0, -1, 1, -1, -1, 1, 1};     //대각선까지 포함
    static int dirY[] = {-1, 1, 0, 0, 1, -1, 1, -1};
    static int[][] arr;
    static boolean[][] visited;
    static int w, h;
    static int nowX, nowY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) break;
            else {
                arr = new int[h][w];
                visited = new boolean[h][w];
                for (int i = 0; i < h; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < w; j++) {
                        arr[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                int cnt = 0;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (arr[i][j] == 1 && !visited[i][j]) {
                            bfs(i, j);
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
            }
        }

    }

    public static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            visited[poll[0]][poll[1]] = true;
            for (int k = 0; k < dirX.length; k++) {
                nowX = poll[0] + dirX[k];
                nowY = poll[1] + dirY[k];
                if (nowX >= 0 && nowX < h && nowY >= 0 && nowY < w) {
                    if (arr[nowX][nowY] == 1 && !visited[nowX][nowY]) {
                        visited[nowX][nowY] = true;
                        queue.offer(new int[]{nowX, nowY});
                    }
                }
            }
        }

    }
}
