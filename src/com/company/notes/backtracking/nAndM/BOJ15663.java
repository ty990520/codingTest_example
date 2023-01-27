package com.company.notes.backtracking.nAndM;

import java.io.*;
import java.util.*;

/*
 * N과 M (9)
 * */
public class BOJ15663 {
    static int n, m;
    static LinkedHashSet<String> set;
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
        set = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dfs(1);

        for (String s : set) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int level) throws IOException {
        if (level == m + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= m; i++) {
                sb.append(output[i] + " ");
            }
            set.add(sb.toString());
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                output[level] = input[i];
                dfs(level + 1);
                isUsed[i] = false;
            }
        }
    }
}
