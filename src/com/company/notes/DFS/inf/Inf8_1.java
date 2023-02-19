package com.company.notes.DFS.inf;

import java.util.Scanner;

// 포함, 비포함 문제의 경우 DFS를 두번 호출하기!!
public class Inf8_1 {
    static String answer = "NO";
    static int arr[];
    static int n, total;

    public static void main(String[] args) {
        Inf8_1 test = new Inf8_1();

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        test.dfs(0, 0);

        System.out.println(answer);
    }

    public static void dfs(int level, int sum) {
        if (answer.equals("YES")) return;
        if(sum>total/2) return;
        if (level == n) {
            if (total - sum == sum) {
                answer = "YES";
            }
        } else {
            dfs(level+1, sum + arr[level]);    //포함하는 경우
            dfs(level+1, sum);    //포함하지 않는 경우
        }
    }
}
