package com.company.notes.dataStructure.queue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        bw.write("<");
        int cnt = 1;
        while (queue.size() > 1) {
            if (cnt % k == 0) bw.write(queue.poll() + ", ");
            else queue.add(queue.poll());
            cnt++;
        }
        bw.write(queue.poll() + ">");
        bw.flush();
        bw.close();
    }
}
