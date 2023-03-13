package com.company.notes.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {
    static int[] nums;
    static int[] sign = new int[4];
    static int n, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            sign[i] = Integer.parseInt(st.nextToken());
        }
        dfs(nums[0],1); //첫 숫자(누적합을 구해야하므로), 다음 계산할 값 인덱스

    }

    public static void dfs(int num, int next){
        if(next==n){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = 0; i < sign.length; i++) {
            if(sign[i]>0){
                sign[i]--;
                if(i==0){
                    dfs(num+nums[next], next+1);
                }else if(i==1){
                    dfs(num-nums[next], next+1);
                }else if(i==2){
                    dfs(num*nums[next], next+1);
                }else if(i==3){
                    dfs(num/nums[next], next+1);
                }
                sign[i]++;
            }
        }
    }
}