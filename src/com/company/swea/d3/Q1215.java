package com.company.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1215 {
    static final int SIZE = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc <= 10; tc++) {
            int answer=0;
            int len = Integer.parseInt(br.readLine());
            char[][] arr = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                String str = br.readLine();
                for (int j = 0; j < SIZE; j++) {
                    arr[i][j] = str.charAt(j);
                }

            }

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE-len+1; j++) {
                    StringBuilder sb1 = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    for (int k = 0; k <len; k++) {
                        sb1.append(arr[i][j+k]);
                        sb2.append(arr[j+k][i]);
                    }
                    if(isPalindrome(len, sb1)){
                        answer++;
                    }
                    if(isPalindrome(len, sb2)){
                        answer++;
                    }
                }
            }
            System.out.println("#"+tc+" "+answer);
        }
    }

    private static boolean isPalindrome(int len, StringBuilder sb) {
        int l = 0;
        int r = len -1;
        while(l<=r){
            if(sb.charAt(l)!= sb.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
