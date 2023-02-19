package com.company.notes.BFS.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*
* */
public class BOJ2667 {
    static int n;
    static int dirX[] = {0, 0, -1, 1};      //상하좌우
    static int dirY[] = {-1, 1, 0, 0};      //상하좌우
    private static Integer[][] arr;
    private static boolean[][] visited;
    static int houseCnt = 0, houseIndex = 0;
    static int nowX, nowY;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n][n];
        visited = new boolean[n][n];
        List<Integer> houseCntList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < n; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    houseCnt = 0;
                    houseIndex++;
                    dfs(i, j);
                    houseCntList.add(houseCnt);
                }
            }
        }
        System.out.println(houseCntList.stream().count());
        Collections.sort(houseCntList);
        for (Integer houseCnt : houseCntList) {
            System.out.println(houseCnt);
        }
        br.close();
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        arr[x][y] = houseIndex;
        houseCnt++;

        for (int i = 0; i < 4; i++) {   // 4 = 상하좌우
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;
            if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < n) {
                if (!visited[nowX][nowY] && arr[nowX][nowY] == 1) {
                    visited[nowX][nowY] = true;
                    arr[nowX][nowY] = houseIndex;
                    dfs(nowX, nowY);
                }
            }
        }
    }
}

/* 참고 블로그
https://velog.io/@lifeisbeautiful/Java-%EB%B0%B1%EC%A4%80-2667%EB%B2%88-%EB%8B%A8%EC%A7%80%EB%B2%88%ED%98%B8%EB%B6%99%EC%9D%B4%EA%B8%B0-%EC%9E%90%EB%B0%94
*/

