package com.company.notes.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* DFS+백트래킹 */
public class BOJ1987 {
    static char[][] board;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static int r, c, answer = Integer.MIN_VALUE;
    static HashSet<Character> alphabet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        board = new char[r][c];
        alphabet = new HashSet<>();
        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        alphabet.add(board[0][0]);
        dfs(0, new int[]{0, 0});
        System.out.println(answer);
    }

    public static void dfs(int level, int[] site) {
        boolean isFinish = true;
        for (int i = 0; i < dirX.length; i++) {
            int nowX = site[0] + dirX[i];
            int nowY = site[1] + dirY[i];
            if (nowX >= 0 && nowX < r && nowY >= 0 && nowY < c) {
                if (!alphabet.contains(board[nowX][nowY])) {
                    isFinish = false;
                    alphabet.add(board[nowX][nowY]);
                    dfs(level + 1, new int[]{nowX, nowY});
                    alphabet.remove(board[nowX][nowY]);
                }
            }
        }
        if (isFinish) {
            answer = Math.max(answer, level + 1);
        }
    }
}
