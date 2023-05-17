package com.company.swea.d2;

import java.io.*;
import java.util.ArrayList;

public class Q1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < Integer.parseInt(str[1]); j++) {
                    list.add(str[0]);
                }
            }
            bw.write("#" + tc + "\n");
            bw.write(list.get(0));
            for (int j = 1; j < list.size(); j++) {
                if (j % 10 == 0) {
                    bw.newLine();
                }
                bw.write(list.get(j));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
