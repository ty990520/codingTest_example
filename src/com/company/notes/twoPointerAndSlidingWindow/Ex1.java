package com.company.notes.twoPointerAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public int[] solution(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] result = new int[size];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }
        for (int i : T.solution(arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}
