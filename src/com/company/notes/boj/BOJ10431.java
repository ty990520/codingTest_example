package com.company.notes.boj;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10431 {
    static int NUM_OF_KIDS = 20;
    static int[] kids;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int p = Integer.parseInt(br.readLine());
        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            kids = new int[NUM_OF_KIDS];
            int t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < NUM_OF_KIDS; j++) {
                kids[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = solution();
            bw.write(t+" "+cnt+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static int solution() {
        int cnt = 0;
        for (int j = 1; j < NUM_OF_KIDS; j++) {
            int idx = findMinIdx(j);
            if (idx != j) {
                cnt = swap(cnt, j, idx);
            }
        }
        return cnt;
    }

    private static int swap(int cnt, int j, int idx) {
        int now = j;
        int temp = kids[now];
        while (idx != now) {
            cnt++;
            kids[now] = kids[now-1];
            now--;
        }
        kids[now] = temp;
        return cnt;
    }

    private static int findMinIdx(int j) {
        int idx = j;
        for (int k = j - 1; k >= 0; k--) {
           if(kids[j]<kids[k]) idx = k;
        }
        return idx;
    }
}
