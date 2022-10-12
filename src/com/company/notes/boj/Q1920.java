package com.company.notes.boj;

import java.util.Arrays;
import java.util.Scanner;

public class Q1920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int target = scan.nextInt();
            int findflag = 0;
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int midIndex = (start + end) / 2;
                int mid = arr[midIndex];
                if (target < mid) {
                    end = midIndex - 1;
                } else if (target == mid) {
                    findflag = 1;
                    break;
                } else {
                    start = midIndex + 1;
                }
            }
            System.out.println(findflag);
        }
        scan.close();
    }
}
