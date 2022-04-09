package com.company;


import com.company.notes.sortingAndSearching.Ex1;
import com.company.notes.sortingAndSearching.Ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[][] solution(int size, int[][] arr) {
        int[][] result = new int[size][2];

        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int[][] solution = T.solution(n, arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i : T.solution(n, arr)) {

        }
    }
}
