package com.company.notes.DFS;

import java.util.Scanner;

public class Inf8_10 {
    static int[][] arr;
    static int answer;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};

    public static int solution() {
        arr[0][0] = 1;
        dfs(0, 0);
        return answer;
    }

    public static void main(String[] args) {
        Inf8_10 T = new Inf8_10();
        Scanner scan = new Scanner(System.in);
        arr = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = scan.nextInt();
            }
        }


        System.out.println(T.solution());

    }

    public static void dfs(int x, int y) {
        if (x == 6 && y == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nowX = dirX[i] + x;
                int nowY = dirY[i] + y;
                if (nowX >= 0 && nowX < 7 && nowY >= 0 && nowY < 7) {
                    if (arr[nowX][nowY] == 0) {
                        arr[nowX][nowY] = 1;
                        dfs(nowX, nowY);
                        arr[nowX][nowY] = 0;    //back
                    }
                }
            }
        }
    }
}
