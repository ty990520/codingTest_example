package com.company.notes.array;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public boolean isPrime(int num) {
        if(num==1) return false;

        for (int i = 2; i < num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String reverse = new StringBuffer(String.valueOf(nums[i])).reverse().toString();
            int num = Integer.parseInt(reverse);
            if (isPrime(num))
                result.add(num);
        }

        return result;
    }

    public static void main(String[] args) {
        Ex6 T = new Ex6();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i : T.solution(n, nums)) {
            System.out.print(i + " ");
        }
    }
}