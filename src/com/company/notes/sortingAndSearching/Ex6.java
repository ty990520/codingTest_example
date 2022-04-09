package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public int[] solution(int size, int[] arr) {
        int[] result = new int[2];
        int cnt = 0;
        int[] tmp = new int[size];
        //깊은 복사
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(tmp);
        for (int i = 0; i < size; i++) {
            if(arr[i]!=tmp[i]) {
                result[cnt]=i+1;
                cnt++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex6 T = new Ex6();
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
