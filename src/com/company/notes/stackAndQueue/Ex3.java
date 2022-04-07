package com.company.notes.stackAndQueue;

import java.util.Scanner;

public class Ex3 {
    public int solution(int n, int[][] board, int m, int[] moves){
        int result = 0;


        return result;
    }
    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        int m = scan.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,board,m,moves));
    }
}
