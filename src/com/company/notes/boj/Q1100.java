package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1100 {
    static int CHESS_ROWSIZE = 8;
    public void solution(String[] lineStr) {
        int cnt = 0;
        int chessBoard[][] = new int[CHESS_ROWSIZE][CHESS_ROWSIZE];
        //체스판 색 초기화
        for (int i = 1; i <= CHESS_ROWSIZE; i++) {
            char[] chars = lineStr[i - 1].toCharArray();
            for (int j = 1; j <= CHESS_ROWSIZE; j++) {
                int flag = 0;
                if (chars[j - 1] == 'F') flag = 1;
                if (i % 2 == 1) {
                    if (j % 2 == 1)     //홀-홀 => 하얀색
                        chessBoard[i - 1][j - 1] = flag;
                    else                //홀-짝 => 검정색
                        chessBoard[i - 1][j - 1] = 0;
                } else {
                    if (j % 2 == 1)     //짝-홀 => 검정색
                        chessBoard[i - 1][j - 1] = 0;
                    else                //짝-짝 => 하얀색
                        chessBoard[i - 1][j - 1] = flag;
                }
                if (chessBoard[i - 1][j - 1] == 1) cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        Q1100 T = new Q1100();
        String lineStr[] = new String[CHESS_ROWSIZE];
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < CHESS_ROWSIZE; i++) {
            lineStr[i] = br.readLine();
        }
        T.solution(lineStr);
    }
}
