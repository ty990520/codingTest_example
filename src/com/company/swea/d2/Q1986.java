package com.company.swea.d2;

import java.util.Scanner;

public class Q1986 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            int result = 0;
            for (int j = 1; j <= n; j++) {
                if (j % 2 != 0) result += j;
                else result -= j;
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
