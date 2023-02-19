package com.company.notes.DFS.inf;

import java.util.Scanner;

public class Ex2 {
    static int weight = 0;
    static int num = 0;
    static int arr[];
    static int check[];
    static int max = Integer.MIN_VALUE;

    public void dfs(int level) {
        if (level == num + 1) {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                if (check[i] == 1) {
                    sum += arr[i - 1];
                }
            }
            if (sum <= weight) {
                max = Math.max(max, sum);
            }
        } else {
            check[level] = 1;
            dfs(level + 1); //왼쪽 가지 (o인 경우)
            check[level] = 0;
            dfs(level + 1); //오른쪽 가지 (x인 경우)
        }
    }

    public static void main(String[] args) {
        Ex2 T = new Ex2();
        Scanner scan = new Scanner(System.in);
        weight = scan.nextInt();
        num = scan.nextInt();
        check = new int[num + 1];
        arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        T.dfs(0);
        System.out.println(max);
    }
}
