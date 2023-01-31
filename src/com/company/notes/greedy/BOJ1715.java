package com.company.notes.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ1715 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        for (long i = 0; i < n; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }
        int answer=0;
        while (queue.size()>=2) {
            Integer a = queue.poll();
            Integer b = queue.poll();
            queue.add(a+b);
            answer+= a+b;
        }
        System.out.println(answer);
    }
}
