package com.company.notes.DFS.inf;

import java.util.Scanner;

public class Ex3 {
    static int num = 0;
    static int limit = 0;
    static int scores[];
    static int times[];
    static int check[];
    static int maxScore = Integer.MIN_VALUE;

    public void dfs(int level) {
        if (level == num + 1) {
            int score_sum = 0, times_sum = 0;
            for (int i = 1; i <= num; i++) {
                if (check[i] == 1) {
                    score_sum += scores[i - 1];
                    times_sum += times[i - 1];
                }
            }
            if (times_sum <= limit) {
                maxScore = Math.max(maxScore, score_sum);
            }
        } else {
            check[level] = 1;
            dfs(level + 1); //왼쪽 가지 (o인 경우)
            check[level] = 0;
            dfs(level + 1); //오른쪽 가지 (x인 경우)
        }
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        limit = scan.nextInt();
        check = new int[num + 1];
        scores = new int[num];
        times = new int[num];
        for (int i = 0; i < num; i++) {
            int score = scan.nextInt();
            int time = scan.nextInt();
            scores[i] = score;
            times[i] = time;
        }
        T.dfs(0);
        System.out.println(maxScore);
    }
}
