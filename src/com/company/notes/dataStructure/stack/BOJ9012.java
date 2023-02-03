package com.company.notes.dataStructure.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            stack = new Stack<>();
            st = new StringTokenizer(br.readLine());
            for (char c : st.nextToken().toCharArray()) {
                if (c == '(') {
                    if (stack.isEmpty() || stack.peek() == c) {
                        stack.add(c);
                    } else if (stack.peek() != c) {
                        stack.pop();
                    }
                } else {
                    if (stack.isEmpty()) {
                        stack.add(c);
                        break;
                    } else if (stack.peek() == c) {
                        stack.add(c);
                    } else if (stack.peek() != c) {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) bw.write("YES");
            else bw.write("NO");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
