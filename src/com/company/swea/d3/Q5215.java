package com.company.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5215 {
    static int[] t;
    static int[] k;
    static int n, l;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= test; tc++) {
            max = Integer.MIN_VALUE;
            String[] str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]);
            l = Integer.parseInt(str[1]);
            t = new int[n];
            k = new int[n];
            for (int i = 0; i < n; i++) {
                str = br.readLine().split(" ");
                t[i] = Integer.parseInt(str[0]);	//점수
                k[i] =  Integer.parseInt(str[1]);	//칼로리
            }
            recursive(0,0,0);

            System.out.println("#"+tc+" "+max);
        }
    }
    private static void recursive(int kSum, int tSum, int level) {
        if(kSum <= l) max = Math.max(max, tSum);
        if(kSum > l) return;
        if(level == n) return;

        recursive(kSum + k[level], tSum+ t[level],level+1);
        recursive(kSum, tSum,level+1);

//		 max= Math.max(max,tSum);
//		 System.out.println("level : "+level+" >> kSum : "+kSum+", tSum : "+tSum);
//
//		if(level==n) return;
//
//		if(kSum+k[level]>l) return;
//	   recursive(kSum+k[level], tSum+t[level], level+1);
//	   recursive(kSum, tSum, level+1);
    }
}
