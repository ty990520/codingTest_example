package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Scanner;

public class Ex3 {
    //삽입정렬
    //2번째 원소부터 시작해서 앞의 원소들과 비교
    public int[] solution(int size, int[] arr){
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Ex3 T = new Ex3();
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
