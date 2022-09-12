package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1267 {
    public static void main(String[] args) throws IOException {
        int planY = 10;
        int timeY = 30;
        int planM = 15;
        int timeM = 60;
        int totalPayY = 0;
        int totalPayM = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(stringTokenizer.nextToken());
            totalPayY += planY * (time / timeY + 1);
            totalPayM += planM * (time / timeM + 1);
        }
        if (totalPayY < totalPayM) {
            System.out.println("Y "+totalPayY);
        } else if (totalPayM < totalPayY) {
            System.out.println("M " + totalPayM);
        } else {
            System.out.println("Y M " + totalPayY);
        }
    }
}
