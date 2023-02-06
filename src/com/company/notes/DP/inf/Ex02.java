package com.company.notes.DP.inf;

import java.util.Scanner;

public class Ex02 {
    public static int solution(int n){
        int arr[] = new int[n+1];
        arr[0] = 1;
        arr[1] = 2;

        for(int i=2; i<=n;i++){
            arr[i] = arr[i-2]+arr[i-1];
        }

        return arr[n];
    }
    public static void main(String[] args) {
        Ex02 T = new Ex02();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
