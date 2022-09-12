package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1284 {
    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            int sum = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') sum += 4;
                else if (c == '1') sum += 2;
                else sum += 3;
            }
            System.out.println(2 + (str.length() - 1) + sum);
        }
    }
}
