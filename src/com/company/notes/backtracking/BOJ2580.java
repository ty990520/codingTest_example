package com.company.notes.backtracking;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2580 {
    static int[][] board;
    static ArrayList<Site> zeros;
    static boolean isFinish;
    static BufferedReader br;
    static BufferedWriter bw;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        zeros = new ArrayList<>();
        board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 0) {
                    zeros.add(new Site(i, j));
                }
                board[i][j] = val;
            }
        }
        dfs(0);


    }

    public static void dfs(int level) throws IOException {
        if (level == zeros.size()) {
            for (int[] ints : board) {
                for (int i : ints) {
                    bw.write(i + " ");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();
            System.exit(0);
        }
        Site site = zeros.get(level);
        findEmptyValue(site);
        for (int i = 1; i < site.checked.length; i++) {
            if (!site.checked[i]) {
                board[site.x][site.y] = i;
                dfs(level + 1);
            }
        }
    }

    private static void findEmptyValue(Site site) {
        for (int i = 0; i < 9; i++) {
            site.checked[board[site.x][i]] = true;
            site.checked[board[i][site.y]] = true;
        }
        int startX = site.x / 3 * 3;
        int startY = site.y / 3 * 3;
        for (int i = startX; i < startX + 3; i++) {
            for (int j = startY; j < startY + 3; j++) {
                site.checked[board[i][j]] = true;
            }
        }
    }

    static class Site {
        int x;
        int y;
        boolean[] checked;

        public Site(int x, int y) {
            this.x = x;
            this.y = y;
            checked = new boolean[10];
        }
    }
}
