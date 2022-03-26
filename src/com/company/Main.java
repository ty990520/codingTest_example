package com.company;

import java.util.*;

public class Main {
//    public int[] solution(int n, int[] nums){
//
//    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i : T.solution(n,nums)) {
            System.out.println(i);
        }
    }
}
