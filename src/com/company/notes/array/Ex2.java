package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex2 {
    public int solution(int num, int[] nums){
        int result = 0;
        int max = 0;
        for (int i : nums) {
            if(max<i){
                max=i;
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Ex2 T = new Ex2();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println(T.solution(num, nums));
    }
}
