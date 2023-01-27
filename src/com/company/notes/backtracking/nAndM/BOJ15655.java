package com.company.notes.backtracking.nAndM;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * N과 M (6)
 * */
public class BOJ15655 {
    static int n, m;
    static int[] input, output;
    static boolean[] isUsed;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        input = new int[n + 1];
        output = new int[m + 1];
        isUsed = new boolean[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dfs(1);
        bw.flush();
        bw.close();
    }

    private static void dfs(int level) throws IOException {
        if (level == m + 1) {
            for (int i = 1; i <= m; i++) {
                bw.write(output[i] + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!isUsed[i] && output[level - 1] < input[i]) {
                isUsed[i] = true;
                output[level] = input[i];
                dfs(level + 1);
                isUsed[i] = false;
            }
        }
    }
}
