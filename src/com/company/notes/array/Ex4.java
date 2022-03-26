package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex4 {
    public int[] solution(int num){
        int[] results = new int[num];
        results[0] = 1;
        results[1] = 1;
        for (int i = 2; i < num; i++) {
            results[i] = results[i-2]+results[i-1];
        }
        return results;
    }
    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int n : T.solution(num)) {
            System.out.print(n+" ");
        }
    }
}
