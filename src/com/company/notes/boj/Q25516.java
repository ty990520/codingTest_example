package com.company.notes.boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q25516 {
    static int n, k;
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] apple;
    static int cnt;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();

        arr = new ArrayList[n];
        visited = new boolean[n];
        apple = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int s = scan.nextInt();
            int e = scan.nextInt();
            arr[s].add(e);
        }

        for (int i = 0; i < n; i++) {
            apple[i] = scan.nextInt();
        }

        if (apple[0] == 1)  cnt = 1;
        else cnt = 0;

        dfs(0, 1);
        System.out.println(cnt);
    }

    private static void dfs(int i, int height) {
        if (height > k) return;

        for (Integer e : arr[i]) {
            if (!visited[e]) {
                visited[e] = true;
                if (apple[e] == 1) cnt++;
                dfs(e, height + 1);
            }
        }
    }
}
