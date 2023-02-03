package com.company.notes.DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1074 {
    static int N, r, c;
    static int answer, cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int pow = (int) Math.pow(2, N);
        partition(0, 0, pow);
        System.out.println(answer);
    }

    private static void partition(int x, int y, int size) {
        if (size == 1) {
            if (x == r && y == c) answer = cnt;
            cnt++;
            return;
        }
        int devide = size / 2;
        partition(x, y, devide);
        partition(x, y + devide, devide);
        partition(x + devide, y, devide);
        partition(x + devide, y + devide, devide);
    }
}
