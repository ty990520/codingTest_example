package com.company.swea.d2;

import java.util.Scanner;

public class Q2005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            int[][] arr = new int[n][n];
            initVal(n, arr);

            for (int x = 1; x < n; x++) {
                for (int y = 1; y <= x; y++) {
                    if (isValidLeftVal(arr, x, y) || isValidRightVal(arr, x, y)) {
                        arr[x][y] = arr[x - 1][y - 1] + arr[x - 1][y];
                    } else {
                        arr[x][y] = 1;
                    }
                }
            }
            System.out.println("#"+i);
            printReslut(arr);
        }
    }

    private static void printReslut(int[][] arr) {
        for (int[] ints : arr) {
            for (int a : ints) {
                if(a!=0) System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    private static void initVal(int n, int[][] arr) {
        arr[0][0] = 1;
        for (int j = 1; j < n; j++) {
            arr[j][0] = 1;
        }
    }

    private static boolean isValidRightVal(int[][] arr, int x, int y) {
        return arr[x - 1][y] != 0;
    }

    private static boolean isValidLeftVal(int[][] arr, int x, int y) {
        return arr[x - 1][y - 1] != 0;
    }
}
