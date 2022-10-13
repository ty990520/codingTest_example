package com.company.notes.boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1325 {
    static int n,m;
    static ArrayList<Integer>[] arr;
    static int[] visited;
    static List<Integer> answer;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();

        arr = new ArrayList[n+1];
        answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            arr[start].add(end);
        }

        for (int i = 1; i <= n; i++) {
            if (!arr[i].isEmpty()) {
                visited = new int[n+1];
                bfs(i);
            }
        }
    }

    private static void bfs(int i) {

    }
}
