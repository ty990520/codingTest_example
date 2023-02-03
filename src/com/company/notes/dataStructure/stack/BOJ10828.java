package com.company.notes.dataStructure.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch (op) {
                case "push":
                    stack.push(st.nextToken());
                    break;
                case "pop":
                    bw.write((stack.isEmpty() ? "-1" : stack.pop()) + "\n");
                    break;
                case "size":
                    bw.write((stack.size()) + "\n");
                    break;
                case "empty":
                    bw.write((stack.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "top":
                    bw.write((stack.isEmpty() ? "-1" : stack.peek()) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
