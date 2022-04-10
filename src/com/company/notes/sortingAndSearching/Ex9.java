package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    //결정 알고리즘(이진탐색)
    public int getCnt(int capacity, int[] arr) {
        int cnt = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > capacity) {
                cnt++;
                sum = 0;
            }
            sum += arr[i];
        }
        return cnt;
    }

    public int solution(int num, int[] arr) {
        int result = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {

            int mid = (lt + rt) / 2;
            if (getCnt(mid, arr) <= num) {
                result = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex9 T = new Ex9();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(m, arr));
    }
}
