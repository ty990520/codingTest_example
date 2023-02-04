package com.company.notes.dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2164 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (true) {
            queue.poll();
            if(queue.size()==1)
                break;
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
