package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1212 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuilder totalRestStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int index = Integer.parseInt(str.charAt(i) + "");
            totalRestStr.append(binary[index]);
        }
        if (str.equals("0")) {
            System.out.println("0");
        } else {
            while (totalRestStr.charAt(0) == '0') {
                totalRestStr = new StringBuilder(totalRestStr.substring(1));
            }
            System.out.println(totalRestStr);
        }
    }
}
