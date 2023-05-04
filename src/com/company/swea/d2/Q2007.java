package com.company.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Q2007 {
    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String str = br.readLine();
            for (int j = 1; j <= 10; j++) {
                if (str.substring(0, j).equals(str.substring(j, j * 2))) {
                    System.out.println("#"+i+" "+j);
                    break;
                }
            }
        }
    }
}
