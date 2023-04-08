package com.company.notes.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1043 {
    static int[] pwkts;
    static int[] parents;
    static Set<Integer>[] party;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parents = new int[n + 1];
        party = new HashSet[n + 1];

        for (int i = 1; i <= n; i++) {
            parents[i] = i;
            party[i] = new HashSet<>();
        }

        st = new StringTokenizer(br.readLine());
        int pwktNum = Integer.parseInt(st.nextToken());
        if (pwktNum == 0) {
            System.out.println(m);
            return;
        }

        /* 진실을 아는 사람 배열 저장 */
        pwkts = new int[pwktNum];
        for (int i = 0; i < pwktNum; i++) {
            pwkts[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int peopleNum = Integer.parseInt(st.nextToken());
            int[] participant = new int[peopleNum];
            for (int j = 0; j < peopleNum; j++) {
                int idx = Integer.parseInt(st.nextToken());
                participant[j] = idx;
                party[idx].add(i);
            }

            for (int j = 1; j < participant.length; j++) {
                union(participant[j - 1], participant[j]);
            }
        }


        Set<Integer> pwktsParent = makeSetpwktsParent();

        boolean[] valid = new boolean[m + 1];
        for (int i = 1; i <= n; i++) {
            if (!pwktsParent.contains(parents[i])) {
                for (Integer p : party[i]) {
                    valid[p] = true;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i < valid.length; i++) {
            if (valid[i]) answer++;
        }
        System.out.println(answer);
    }

    private static Set<Integer> makeSetpwktsParent() {
        Set<Integer> pwktsParent = new HashSet<>();
        for (int i = 0; i < pwkts.length; i++) {
            pwktsParent.add(find(pwkts[i]));
        }
        return pwktsParent;
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parents[b] = a;
        }
    }

    public static int find(int n) {
        if (n == parents[n]) {
            return n;
        }
        return parents[n] = find(parents[n]);
    }

}
