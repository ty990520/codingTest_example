package com.company.notes.dataStructure.deque;

import java.io.*;
import java.util.*;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        Deque<String> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch (op) {
                case "push_front":
                    deque.addFirst(st.nextToken());
                    break;
                case "push_back":
                    deque.addLast(st.nextToken());
                    break;
                case "pop_front":
                    bw.write((deque.isEmpty() ? "-1" : deque.pollFirst()) + "\n");
                    break;
                case "pop_back":
                    bw.write((deque.isEmpty() ? "-1" : deque.pollLast()) + "\n");
                    break;
                case "size":
                    bw.write((deque.size()) + "\n");
                    break;
                case "empty":
                    bw.write((deque.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "front":
                    bw.write((deque.isEmpty() ? "-1" : deque.peekFirst()) + "\n");
                    break;
                case "back":
                    bw.write((deque.isEmpty() ? "-1" : deque.peekLast()) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
