package com.company.notes.twoPointerAndSlidingWindow;

import com.company.Main;

import java.util.Scanner;

public class Ex5 {
    public int solution(int n){
        int result =0;
        int sum = 0;
        int lt = 1;

        for (int rt = 1; rt < n; rt++) {
            sum+=rt;
            if(sum==n){
                result++;
            }
            while (sum>=n){
                sum-=lt;
                lt++;
                if(sum==n){
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
