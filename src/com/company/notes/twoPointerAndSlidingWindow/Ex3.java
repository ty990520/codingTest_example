package com.company.notes.twoPointerAndSlidingWindow;

import com.company.Main;

import java.util.Scanner;

public class Ex3 {
    public int solution(int total, int days, int[] income){
        int result = Integer.MIN_VALUE;
        int sum = 0;
        //초기값
        for (int i = 0; i < days; i++) {
            sum+=income[i];
        }
        if(sum>result)
            result = sum;

        for (int i = 1; i <= total-days; i++) {
            sum = sum-income[i-1]+income[days+i-1];
            if(sum>result)
                result = sum;
        }

        return result;

    }
    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int days = scan.nextInt();
        int[] income = new int[total];
        for (int i = 0; i < total; i++) {
            income[i] = scan.nextInt();
        }
        System.out.println(T.solution(total,days,income));
    }
}
