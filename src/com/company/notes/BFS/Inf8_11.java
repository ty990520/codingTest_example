package com.company.notes.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inf8_11 {
    static int[][] arr;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        arr = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        bfs(0, 0);
        if (arr[6][6] == 0) System.out.println(-1);
        else System.out.println(arr[6][6]);

    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nowX = poll[0] + dirX[k];
                int nowY = poll[1] + dirY[k];
                if (nowX >= 0 && nowX < 7 && nowY >= 0 && nowY < 7) {
                    if (arr[nowX][nowY] == 0) {
                        arr[nowX][nowY] = arr[poll[0]][poll[1]] + 1;
                        queue.offer(new int[]{nowX, nowY});

                    }

                }

            }
        }

    }
}
