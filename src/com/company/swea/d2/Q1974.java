package com.company.swea.d2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1974 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] colNum = new int[10];
    static int[] rowNum = new int[10];
    static int[][] board;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            initBoard();
            boolean isFinish = false;
            for (int i = 0; i < 9; i++) {   //행, 열 검증
                for (int j = 0; j < 9; j++) {
                    colNum[board[i][j]]++;
                    rowNum[board[j][i]]++;
                   if(colNum[board[i][j]]>1 || rowNum[board[j][i]]>1){
                       System.out.println("#" + tc + " 0");
                       isFinish = true;
                       break;
                   }
                }
                if(isFinish) break;
                colNum = new int[10];
                rowNum = new int[10];
            }
            if(!isFinish){ //3x3 검증

            }

        }

    }

    private static void initBoard() throws IOException {
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }

        }
    }
}
