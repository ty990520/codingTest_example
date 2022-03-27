package com.company;

import com.company.notes.array.Ex6;

import java.util.*;

public class Main {
    public int[] solution(int n, int[] nums){
        for (int i = 0; i < n; i++) {
            String reverse = new StringBuffer(String.valueOf(nums[i])).reverse().toString();
            nums[i] = Integer.parseInt(reverse);
        }

//        int[] tmp = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i]%3==0 && nums[i]!=3){

            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i : T.solution(n,nums)) {
            System.out.print(i+" ");
        }
    }
}
