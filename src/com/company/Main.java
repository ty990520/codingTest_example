package com.company;


import com.company.notes.sortingAndSearching.Ex1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int[] solution(int size, int[] arr) {

    }

    public static void main(String[] args) {
        Main T = new Main();
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
