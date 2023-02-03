package com.company.notes.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val == 0) stack.pop();
            else stack.push(val);
        }
        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}
