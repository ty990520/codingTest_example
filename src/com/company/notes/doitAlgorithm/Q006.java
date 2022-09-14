package com.company.notes.doitAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startIndex = 0;
        int endIndex = 0;
        int cnt = 0;
        int arr[] = new int[n];
        //배열초기화
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int sum = arr[0];
        while (endIndex != n - 1) {
            if (n > sum) {
                endIndex++;
                sum+=arr[endIndex];
            } else if (sum > n) {
                sum-=arr[startIndex];
                startIndex++;
            } else {
                endIndex++;
                sum+=arr[endIndex];
                cnt++;
            }
        }
    }
}
