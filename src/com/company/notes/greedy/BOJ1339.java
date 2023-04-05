package com.company.notes.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1339 {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strArr = new String[n];
        int[] alphabet = new int[26];
        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
            char[] chars = strArr[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                alphabet[chars[j] - 65] += Math.pow(10, chars.length - j - 1);
            }
        }

        Arrays.sort(alphabet);

        int val = 9;
        for (int i = alphabet.length-1; i >= 0; i--) {
            answer += alphabet[i] * val--;
        }
        System.out.println(answer);
    }
}
