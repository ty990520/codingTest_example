package com.company.notes.bruteForce;

import java.util.Scanner;

public class BOJ1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((i + "").length() <= 2) {
                answer++;
            } else {
                boolean isHansu = true;
                char[] arr = (i + "").toCharArray();
                int v = arr[0] - arr[1];
                for (int j = 2; j < arr.length; j++) {
                    if (arr[j - 1] - arr[j] != v) {
                        isHansu = false;
                        break;
                    }
                }
                if(isHansu) answer++;
            }
        }
        System.out.println(answer);
    }
}
