package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex10 {
    public int solution(int n, int[][] matrix){
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i!=0){   //상 쪽이 있는 경우
                    if(matrix[i][j]<=matrix[i-1][j]){
                        continue;
                    }
                }
                if(j!=0){   //좌 쪽이 있는 경우
                    if(matrix[i][j]<=matrix[i][j-1]){
                        continue;
                    }
                }
                if(i!=n-1){ //하 쪽이 있는 경우
                    if(matrix[i][j]<=matrix[i+1][j]){
                        continue;
                    }
                }
                if(j!=n-1){ //우 쪽이 있는 경우
                    if(matrix[i][j]<=matrix[i][j+1]){
                        continue;
                    }
                }
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex10 T = new Ex10();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(T.solution(n,matrix));
    }
}
