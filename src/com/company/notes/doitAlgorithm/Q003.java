package com.company.notes.doitAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int arr[] = new int[n + 1];
        int sumArr[] = new int[n + 1];
        int result[] = new int[m];
        stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            arr[i] = num;
            if (i != 1) {
                sumArr[i] = sumArr[i - 1] + num;
            } else {
                sumArr[i] = num;
            }
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            result[i] = sumArr[end] - sumArr[start - 1];
        }
        for (int i : result) {
            System.out.println(i);
        }
    }

}
