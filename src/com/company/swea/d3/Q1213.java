package com.company.swea.d3;

import java.io.*;

public class Q1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 10; i++) {
            int tc = Integer.parseInt(br.readLine());
            String target = br.readLine();
            String str = br.readLine();
            String[] split = str.split(target);
            int answer = split.length - 1;
            if (str.endsWith(target)) answer++;
            bw.write("#" + tc + " " + answer);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
