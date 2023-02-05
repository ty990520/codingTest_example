package com.company.notes.dataStructure.stack;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BOJ1874 {
    static BufferedWriter bw;
    static Queue<Integer> queue;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        queue = new LinkedList<>();
        stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            if (stack.isEmpty()) pushStack();
            if (val < stack.peek()) {
                System.out.println("NO");
                return;
            } else if (val > stack.peek()) {
                while (true) {
                    pushStack();
                    if (val == stack.peek()) break;
                }
            }
            if (val == stack.peek()) popStack();
        }
        bw.flush();
        bw.close();
    }

    private static void pushStack() throws IOException {
        stack.push(queue.poll());
        bw.write("+\n");
    }

    private static void popStack() throws IOException {
        stack.pop();
        bw.write("-\n");
    }
}
