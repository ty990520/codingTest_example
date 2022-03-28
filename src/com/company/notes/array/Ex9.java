package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex9 {
    public int solution(int n, int[][] matrix) {
        int result = Integer.MIN_VALUE;
        int rowSum, colSum, diagonalSum1,diagonalSum2;

        for (int i = 0; i < n; i++) {
            rowSum = colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
                result = Math.max(result, rowSum);
                result = Math.max(result, colSum);
            }
        }

        diagonalSum1 = diagonalSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][n-i-1];
            result = Math.max(result, diagonalSum1);
            result = Math.max(result, diagonalSum2);
        }
        return result;
    }

    public static void main(String[] args) {
        Ex9 T = new Ex9();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(T.solution(n, matrix));
    }
}
