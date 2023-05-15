package com.company.notes.stackAndQueue.boj;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int num = 1;
        int idx = 0;
        StringBuilder sb = new StringBuilder();


        /* 증가하는 수열을 스택에 저장 */
        while (n >= num) {
            if (!stack.isEmpty() && stack.peek() == arr[idx]) {
                sb.append("-\n");
                stack.pop();
                idx++;
            } else {
                sb.append("+\n");
                stack.push(num++);
            }
        }

        /* 남은 스택을 pop시키며 수열 비교 */
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            if (pop != arr[idx]) {
                closeBufferStream(bw, "NO");
                return;
            }
            idx++;
            sb.append("-\n");
        }
        closeBufferStream(bw, sb.toString());
    }

    private static void closeBufferStream(BufferedWriter bw, String sb) throws IOException {
        bw.write(sb);
        bw.flush();
        bw.close();
    }
}
