package com.company;






import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int[] solution(int days, int[] items){
        
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i : T.solution(k,nums)) {
            System.out.print(i+" ");
        }
    }
}
