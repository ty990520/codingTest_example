package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    //결정 알고리즘(이진탐색)
    public int getCount(int dist, int[] arr) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int num, int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        //lt,rt는 가장 가까운 두 말의 최대 거리의 범위에 포함
        int lt = 1;
        int rt = arr[arr.length - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (getCount(mid, arr) >= num) {
                result = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Ex10 T = new Ex10();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(c, arr));
    }
}
