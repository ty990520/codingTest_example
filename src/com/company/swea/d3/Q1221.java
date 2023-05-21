package com.company.swea.d3;

import java.io.*;
import java.util.*;

public class Q1221 {
    static final String[] numStr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> priorityMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            priorityMap.put(numStr[i], i);
        }
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[1]);
            PriorityQueue<Num> list = new PriorityQueue<>();
            String[] str = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                list.add(new Num(str[i], priorityMap.get(str[i])));
            }
            System.out.println("#" + tc);
            for (Num num : list) {
                System.out.print(num.str + " ");
            }
            System.out.println();
        }
    }

    static class Num implements Comparable<Num> {
        String str;
        int prority;

        public Num(String str, int prority) {
            this.str = str;
            this.prority = prority;
        }

        @Override
        public int compareTo(Num o) {
            return this.prority - o.prority;
        }
    }
}
