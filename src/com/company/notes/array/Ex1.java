package com.company.notes.array;



import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> results = new ArrayList<>();
        int cnt = 0;
        //첫번째 수는 무조건 출력
        results.add(nums[0]);

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                results.add(nums[i]);
                cnt++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        ArrayList<Integer> results = T.solution(n, nums);
        for (Integer result : results) {
            System.out.print(result + " ");
        }
    }
}
