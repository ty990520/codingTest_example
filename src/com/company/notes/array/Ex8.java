package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex8 {
    public int[] solution(int n, int[] scores) {
        int[] result = new int[n];
        int rank = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (scores[i] < scores[j]) {
                    rank++;
                }
            }
            result[i] = rank;
            rank = 1;
        }
        for (int i : result) {
            System.out.print(i+" ");
        }
        return result;
    }

    public static void main(String[] args) {
        Ex8 T = new Ex8();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scan.nextInt();
        }
        for (int rank : T.solution(n, scores)) {

        }
    }
}
