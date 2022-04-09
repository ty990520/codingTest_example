package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public String solution(int size, int[] arr) {
        String result = "U";
        Arrays.sort(arr);
        for (int i = 0; i < size-1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }
        return result;
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
