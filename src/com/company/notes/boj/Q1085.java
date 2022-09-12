package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        int min = Integer.MAX_VALUE;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(stringTokenizer.nextToken());
        int y1 = Integer.parseInt(stringTokenizer.nextToken());
        int x2 = Integer.parseInt(stringTokenizer.nextToken());
        int y2 = Integer.parseInt(stringTokenizer.nextToken());

        min = Math.min(x1, min);
        min = Math.min(y1, min);
        min = Math.min(x2 - x1, min);
        min = Math.min(y2 - y1, min);

        System.out.println(min);
    }
}
