package com.company.swea.d2;

import java.io.*;

public class Q1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int speed = 0;
            int answer = 0;
            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                if (str.length() > 1) {
                    String[] command = str.split(" ");
                    int ac = Integer.parseInt(command[1]);
                    if (command[0].equals("1")) {
                        speed += ac;
                    } else {
                        if(speed-ac>=0) speed -= Integer.parseInt(command[1]);
                    }
                }
                answer += speed;
            }
            System.out.println("#"+tc+" "+answer);
        }
    }
}
