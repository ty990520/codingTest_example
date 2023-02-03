package com.company.notes.dataStructure.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        Queue<String> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String last = "";
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch (op) {
                case "push":
                    last = st.nextToken();
                    queue.add(last);
                    break;
                case "pop":
                    bw.write((queue.isEmpty() ? "-1" : queue.poll()) + "\n");
                    break;
                case "size":
                    bw.write((queue.size()) + "\n");
                    break;
                case "empty":
                    bw.write((queue.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "front":
                    bw.write((queue.isEmpty() ? "-1" : queue.peek()) + "\n");
                    break;
                case "back":
                    bw.write((queue.isEmpty() ? "-1" : last) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
