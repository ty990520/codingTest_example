package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex7 {
    public int solution(int n, int[] nums){
        int result = 0;
        int score = 0;
        for (int num : nums) {
            if(num==1){
                score++;
                result+=score;
            }else{
                score=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex7 T = new Ex7();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,nums));
    }
}
