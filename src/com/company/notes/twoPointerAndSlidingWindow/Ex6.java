package com.company.notes.twoPointerAndSlidingWindow;

import com.company.Main;

import java.util.Scanner;

public class Ex6 {
    public int solution(int size, int count, int[] arr) {
        int result = 0;
        int lt = 0;
        int cnt = 0;
        int length = 0;

        for (int rt = 0; rt < size; rt++) {
            if (arr[rt] == 0)
                cnt++;
            while (cnt > count) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            length = rt - lt + 1;
            if (length > result)
                result = length;
        }
        return result;
    }

    public static void main(String[] args) {
        Ex6 T = new Ex6();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
