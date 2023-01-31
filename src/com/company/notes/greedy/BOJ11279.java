package com.company.notes.greedy;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ11279 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (queue.size() != 0) bw.write(queue.poll() + "");
                else bw.write("0");
                bw.newLine();
            } else queue.add(x);
        }
        bw.flush();
        bw.close();
    }
}
