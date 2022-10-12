package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2343 {
    static int arr[];
    static int start = 0, end = 0;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[n];

        stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int lesson = Integer.parseInt(stringTokenizer.nextToken());
            arr[i] = lesson;
            end += lesson;
            if (start < lesson) {
                start = lesson;
            }
        }


        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int bluelayCnt = 0;


            for (int i = 0; i < n; i++) {
                if (sum + arr[i] > mid) {
                    sum = 0;
                    bluelayCnt++;
                }
                sum += arr[i];
            }
            if (sum != 0) {     //탐색 후 sum이 0이 아니라 남아있는 값이 있으면 1개 더 필요
                bluelayCnt++;
            }
            if (bluelayCnt > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start);
        br.close();
    }
}
