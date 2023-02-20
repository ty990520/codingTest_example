package com.company.notes.Implementation;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1966 {
    public static void main(String[] args) throws IOException {
        Queue<Item> queue;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.offer(new Item(j, Integer.parseInt(st.nextToken())));
            }
            int answer = 1;
            while (queue.size() != 1) {
                boolean isMax = true;
                Item item = queue.poll();
                for (Item next : queue) {
                    if (item.priority < next.priority) {
                        queue.offer(item);
                        isMax = false;
                        break;
                    }
                }
                if (isMax) {
                    if (m == item.id) break;
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

    static class Item {
        int id;
        int priority;

        public Item(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}
