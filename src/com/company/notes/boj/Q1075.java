package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1075 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        int original = n % 100;
        int answer = 0;
        if (n % f > original) {
            answer = original + (f - n % f);
        } else if (n % f == original) {
            answer = 0;
        } else {
            int frontNum = n / 100 % 10;
            n = n - n % f;
            while (true) {
                if ((n-f) / 100 % 10 < frontNum) {
                    break;
                }
                n = n - f;
            }
            answer = n % 100;
        }
        System.out.println(String.format("%02d", answer));
    }
}
