package com.company.swea.d2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1974 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] board;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            initBoard();
            // 각 행에 대한 유효성 검사
            if (!checkValidRow()) {
                isNotValid(tc);
                continue;
            }

            // 각 열에 대한 유효성 검사
            if (!checkValidCol()) {
                isNotValid(tc);
                continue;
            }


            // 3*3 격자에 대한 유효성 검사 (4중for문 사용)
            if (!checkValidGrid()) {
                isNotValid(tc);
                continue;
            }

            System.out.println("#" + tc + " 1");

        }

    }

    private static void isNotValid(int tc) {
        System.out.println("#" + tc + " 0");
    }

    private static boolean checkValidGrid() {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean[] gridCheck = new boolean[9];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int num = board[i + k][j + l];
                        if (gridCheck[num - 1]) {
                            return false;
                        }
                        gridCheck[num - 1] = true;
                    }
                }
            }
        }
        return true;
    }

    private static boolean checkValidCol() {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                if (rowCheck[num - 1]) {
                    return false;
                }
                rowCheck[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean checkValidRow() {
        for (int j = 0; j < 9; j++) {
            boolean[] colCheck = new boolean[9];
            for (int i = 0; i < 9; i++) {
                int num = board[i][j];
                if (colCheck[num - 1]) {
                    return false;
                }
                colCheck[num - 1] = true;
            }
        }
        return true;
    }


    private static void initBoard() throws IOException {
        board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }

        }
    }
}
