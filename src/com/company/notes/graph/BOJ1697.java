package com.company.notes.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1697 {
    static int k = 0;
    static final int MAX = 100000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        k = scan.nextInt();
        int result = bfs(n, 0);
        System.out.println(result);
    }

    public static int bfs(int val, int level) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{val, level});

        boolean[] check = new boolean[MAX + 1];

        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();
            Integer pollVal = poll[0];
            Integer pollLevel = poll[1];
            if (pollVal == k) {
                return pollLevel;
            }

            if (pollVal - 1 >= 0 && !check[pollVal - 1]) {
                queue.add(new Integer[]{pollVal - 1, pollLevel + 1});
                check[pollVal - 1] = true;
            }
            if (pollVal + 1 <= MAX && !check[pollVal + 1]) {
                queue.add(new Integer[]{pollVal + 1, pollLevel + 1});
                check[pollVal + 1] = true;
            }
            if (pollVal * 2 <= MAX && !check[pollVal * 2]) {
                queue.add(new Integer[]{pollVal * 2, pollLevel + 1});
                check[pollVal * 2] = true;
            }

        }
        return 0;
    }
}
