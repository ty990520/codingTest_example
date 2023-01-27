package com.company.notes.backtracking.nAndM;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
* N과 M (1)
* */
public class BOJ15649 {
    static boolean[] isUsed;
    static int[] arr;
    static int n, m;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        isUsed = new boolean[n+1];
        arr = new int[m+1];

        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dfs(1);
        bw.flush();
        bw.close();
    }

    private static void dfs(int level) throws IOException {
        if (level == m+1) {
            for (int i =1; i <=m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!isUsed[i]) {
                isUsed[i]  = true;
                arr[level] = i;
                dfs(level+1);
                isUsed[i] = false;
            }
        }
    }
}
