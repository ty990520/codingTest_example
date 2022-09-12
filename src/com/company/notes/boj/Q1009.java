package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1009 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int answer = 1;
            int c = 0;

            if (a % 10 == 1 || a % 10 == 5 || a % 10 == 6 || a % 10 == 0) {
                answer = a % 10;
            } else if (a % 10 == 4 || a % 10 == 9) {
                c = b % 2;
                if(c==0) c=2;
            } else {
                c = b % 4;
                if(c==0) c=4;
            }
            for (int j=0;j<c;j++) answer=(answer*a)%10;
            if(answer==0) answer = 10;
            System.out.println(answer);
        }
    }
}
