package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*자바는 큰 수를 BigInteger로 다룸!!!*/
public class Q1247 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int kTestcaseNum = 3;

        for (int i = 0; i < kTestcaseNum; i++) {
            String str = br.readLine();
            int n = Integer.parseInt(str);
            BigInteger sum = new BigInteger("0");
            for (int j = 0; j < n; j++) {
                String answer = br.readLine();
                sum = sum.add(new BigInteger(answer));
            }
            if (sum.compareTo(new BigInteger("0"))==0) System.out.println("0");
            else if (sum.compareTo(new BigInteger("0"))>0) System.out.println("+");
            else if (sum.compareTo(new BigInteger("0"))<0) System.out.println("-");
        }
    }
}
