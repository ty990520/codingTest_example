package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Scanner;

public class Ex4 {
    public int[] solution(int size, int[] works) {
        int[] cache = new int[size];
        cache[0] = works[0];
        boolean isIncluded = false;

        for (int i = 1; i < works.length; i++) {
            //1. 캐시에 존재하는지 확인 - 존재하면 둘만 스위치
            for (int j = 0; j < cache.length; j++) {
                if (works[i] == cache[j]) {
                    isIncluded = true;
                    int tmp = cache[j];
                    for (int k = j; k > 0; k--) {
                        cache[k] = cache[k-1];
                    }
                    cache[0] = tmp;
                }
            }
            //2. 존재하지 않으면 정렬 (이 때 캐시가 오버플로우면 버림)
            if (!isIncluded) {
                for (int j = size-1; j>0; j--) {
                    cache[j] = cache[j-1];
                }
                cache[0] = works[i];
            }
            isIncluded = false;
        }
        return cache;
    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i : T.solution(s, arr)) {
            System.out.print(i + " ");
        }
    }
}
