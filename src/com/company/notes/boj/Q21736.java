package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q21736 {
    static int n, m, cnt;
    static int dirX[] = {0, 0, -1, 1};      //좌우하상
    static int dirY[] = {-1, 1, 0, 0};     //좌우하상
    static char[][] arr;
    static boolean[][] visited;
    static int nowX, nowY;
    static int doyeonX, doyeonY;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());

        arr = new char[n][m];
        visited = new boolean[n][m];
        cnt = 0;


        for (int i = 0; i < n; i++) {
            int j = 0;
            stringTokenizer = new StringTokenizer(br.readLine());
            for (char element : stringTokenizer.nextToken().toCharArray()) {
                arr[i][j] = element;
                if (element == 'I') {
                    doyeonX = i;
                    doyeonY = j;
                }
                j++;
            }


        }
        dfs(doyeonX, doyeonY);

        if (cnt == 0) {
            System.out.println("TT");
        } else {
            System.out.println(cnt);
        }
        br.close();

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {   // 4 = 상하좌우
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;
            if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < m) {
                if (!visited[nowX][nowY] && arr[nowX][nowY] != 'X') {
                    visited[nowX][nowY] = true;
                    if (arr[nowX][nowY] == 'P') {
                        cnt++;
                    }
                    dfs(nowX, nowY);
                }
            }
        }
    }
}
