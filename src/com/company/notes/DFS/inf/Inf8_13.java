package com.company.notes.DFS.inf;

import java.util.Scanner;

public class Inf8_13 {
    static int n;
    static int[][] board;
    static int[] dirX = {0, 0, -1, 1,-1,-1,1,1};
    static int[] dirY = {-1, 1, 0, 0,1,-1,1,-1};

    public static int solution() {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    dfs(i, j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf8_13 t = new Inf8_13();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        System.out.println(t.solution());

    }

    public static void dfs(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nowX = dirX[i] + x;
            int nowY = dirY[i] + y;
            if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < n) {
                if (board[nowX][nowY] == 1) {
                    board[nowX][nowY] = 0;
                    dfs(nowX, nowY);
                }
            }
        }
    }
}
