package com.company.notes.array;

import java.util.Scanner;

public class Ex5 {
    public int solution(int n){
        int result = 0;
        int[] nums = new int[n+1];  //0으로 초기화된 상태

        nums[0] = 1;    //사용하지 않는 인덱스 제외
        nums[1] = 1;    //1은 소수가 아니므로 제외

        for (int i = 2; i <= n; i++) {
            if(nums[i]==0){
                for (int j = i+i; j <= n; j=j+i) {
                    nums[j] = 1;
                }
            }
        }

        for (int num : nums) {
            if(num==0)
                result++;
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
