package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Scanner;

public class Ex1 {
//    선택정렬
//    1. 이중 for문
//    2. tmp변수 사용
//
    public int[] solution(int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
