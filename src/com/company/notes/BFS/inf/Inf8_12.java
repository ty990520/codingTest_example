package com.company.notes.BFS.inf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inf8_12 {
    static int m, n;
    static int[][] board;
    static int dirX[] = {0, 0, -1, 1};      //좌우하상
    static int dirY[] = {-1, 1, 0, 0};     //좌우하상
    static int nowX, nowY;
    static Queue<int[]> queue = new LinkedList<int[]>();

    public static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        bfs();
    }

    private static boolean checkAllDone() {
        boolean allDone = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] != 1) {
                    allDone = false;
                    break;
                }
            }
        }

        return allDone;
    }

    private static boolean checkZero() {
        boolean zeroFlag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    zeroFlag = true;
                    break;
                }
            }
        }

        return zeroFlag;
    }

    public static void main(String[] args) {
        Inf8_12 T = new Inf8_12();
        Scanner scan = new Scanner(System.in);

        m = scan.nextInt();
        n = scan.nextInt();

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        T.solution();
    }

    private static void bfs() {
        if (queue.isEmpty()) {
            if (checkAllDone()) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        } else {
            int max = 1;
            while (!queue.isEmpty()) {
                int[] poll = queue.poll();
                for (int k = 0; k < 4; k++) {
                    nowX = poll[0] + dirX[k];
                    nowY = poll[1] + dirY[k];
                    if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < m) {
                        if (board[nowX][nowY] == 0) {
                            board[nowX][nowY] = board[poll[0]][poll[1]] + 1; //지나온 depth값 저장
                            max = Math.max(max, board[nowX][nowY]);
                            queue.offer(new int[]{nowX, nowY});
                        }
                    }

                }
            }
            if (checkZero())
                System.out.println(-1);
            else
                System.out.println(max - 1);
        }

    }
}
