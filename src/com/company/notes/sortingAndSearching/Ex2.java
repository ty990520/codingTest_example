package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Scanner;

public class Ex2 {
    //    버블정렬
    public int[] solution(int size, int[] arr) {

        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Ex2 T = new Ex2();
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
