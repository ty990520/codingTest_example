package com.company.notes.backtracking;

import java.util.Scanner;

public class BOJ9663 {
    static int[] arr;
    static int n, answer;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];

        dfs(0);
        System.out.println(answer);
    }

    public static void dfs(int level){
        if(level==n){
            answer++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[level] = i;        //조건에 성립하는 데이터가 새로 덮어씌워지기 때문에 따로 back할 필요 없음
            if(isPossible(level)){
               dfs(level+1);
            }
        }
    }

    public static boolean isPossible(int level){
        for (int i = 0; i < level; i++) {
            if(arr[i]==arr[level]){
                return false;
            }
            if(Math.abs(level - i)==Math.abs(arr[level] - arr[i])){
                return false;
            }
        }
        return true;
    }
}

/* 출처
 * https://st-lab.tistory.com/118
 * */