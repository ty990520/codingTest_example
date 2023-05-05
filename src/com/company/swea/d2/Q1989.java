package com.company.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String str = br.readLine();
            int left=0;
            int right=str.length()-1;
            int answer=1;

            while(left<right){
                if(str.charAt(left)==str.charAt(right)){
                    left++;
                    right--;
                }else{
                    answer=0;
                    break;
                }
            }
            System.out.println("#" + i + " " + answer);
        }
    }
}
