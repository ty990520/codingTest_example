package com.company.notes.DFS.inf;

import java.util.Scanner;

public class Ex1 {
    static int size = 0;
    static int arr[];
    static int check[];
    static boolean flag = false;

    public void dfs(int level) {
        if (flag) return;
        if (level == size + 1) {
            int sum1 = 0, sum2 = 0;
            for (int i = 1; i <= size; i++) {
                if (check[i] == 1) {
                    sum1 += arr[i - 1];
                } else {
                    sum2 += arr[i - 1];
                }
            }
            if (sum1 == sum2) {
                flag = true;
                return;
            }
        } else {
            check[level] = 1;
            dfs(level + 1); //왼쪽 가지 (o인 경우)
            check[level] = 0;
            dfs(level + 1); //오른쪽 가지 (x인 경우)
        }
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        check = new int[size + 1];
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        T.dfs(0);
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }

}
