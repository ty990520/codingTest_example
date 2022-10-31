package com.company.notes.boj;

import java.util.Scanner;

public class Q2573 {
    static int dirX[] = {0, 0, -1, 1};      //좌우하상
    static int dirY[] = {-1, 1, 0, 0};     //좌우하상
    static boolean[][] visited;       //2차원 배열로 구현
    static int nowX, nowY;
    static int[][] before;
    static int[][] after;
    static int n, m;

    public static int solution() {
        int answer = 0;

        while (true) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (before[i][j] != 0 && !visited[i][j]) {
                        count++;
                        if(count>1) return answer;
                        dfs(i, j);
                    }

                }
            }
            if (checkFinish()) return 0;

            for (int i = 0; i < n; i++) {
                if (m >= 0) System.arraycopy(after[i], 0, before[i], 0, m);
            }
            answer++;
            visited = new boolean[n][m];
        }
    }

    private static boolean checkFinish() {
        boolean flag = true;
        for (int[] arr : after) {
            for (int ice : arr) {
                if (ice != 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Q2573 T = new Q2573();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        before = new int[n][m];
        after = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = scan.nextInt();
                before[i][j] = val;
                after[i][j] = val;
            }
        }

        System.out.println(T.solution());
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {   // 4 = 상하좌우
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;
            if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < m) {
                if (before[nowX][nowY] == 0) {
                    after[x][y] -= 1;
                    if (after[x][y] < 0) after[x][y] = 0;
                } else {
                    if (!visited[nowX][nowY]) {
                        visited[nowX][nowY] = true;
                        dfs(nowX, nowY);
                    }
                }
            }
        }
    }
}
