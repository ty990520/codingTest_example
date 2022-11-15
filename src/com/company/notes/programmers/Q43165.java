package com.company.notes.programmers;

import java.util.Scanner;

public class Q43165 {
    static int size;
    static int target;
    static int[] arr;
    static boolean[] isPlus;
    static int cnt = 0;

    public void dfs(int level) {
        if (level == size) {
            int sum = 0;
            for (int i = 0; i < isPlus.length; i++) {
                if (isPlus[i]) sum += arr[i];
                else sum -= arr[i];
            }
            if (sum == target) cnt++;
        } else {
            isPlus[level] = false;
            dfs(level + 1);
            isPlus[level] = true;
            dfs(level + 1);
        }
    }

    public static void main(String[] args) {
        Q43165 T = new Q43165();
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        target = scan.nextInt();

        arr = new int[size];
        isPlus = new boolean[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }


        T.dfs(0);
        System.out.println(cnt);
    }
}
