package com.company.swea.d2;

import java.util.Scanner;

public class Q1970_v2 {
    public static void main(String[] args) {
        final int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            System.out.println("#" + tc);
            int n = scan.nextInt();
            for (int i : coin) {
                System.out.print((n / i) + " ");
                n %= i;
            }
            System.out.println();
        }
    }
}
