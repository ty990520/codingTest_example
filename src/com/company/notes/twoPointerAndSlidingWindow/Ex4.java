package com.company.notes.twoPointerAndSlidingWindow;

import com.company.Main;

import java.util.Scanner;

public class Ex4 {
    public int solution(int size, int number, int[] arr){
        int result =0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < size; rt++) {
            sum+=arr[rt];
            if(sum==number){
                result++;
            }
            while (sum>=number){
                sum-=arr[lt];
                lt++;
                if(sum==number){
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex4 T= new Ex4();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
