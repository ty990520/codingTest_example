package com.company.notes.dataStructure.queue;

import java.io.*;
import java.util.PriorityQueue;

public class BOJ1927 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> queue = new PriorityQueue();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val==0) {
                bw.write(queue.isEmpty() ? "0" : queue.poll()+"");
                bw.newLine();
            } else {
                queue.add(val);
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
