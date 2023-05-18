package com.company.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int dump = Integer.parseInt(br.readLine());    //덤프횟수
            ArrayList<Integer> list = new ArrayList<>();
            String[] split = br.readLine().split(" ");
            for (int i = 0; i < split.length; i++) {
                list.add(Integer.valueOf(split[i]));
            }
            for (int i = 0; i < dump; i++) {
                Collections.sort(list);
                int num1 = list.get(0) +1;
                int num2 = list.get(list.size() - 1) -1;
                list.remove(0);
                list.remove(list.size() - 1);
                list.add(num1);
                list.add(num2);
            }
            Collections.sort(list);
            int result = list.get(list.size() - 1) - list.get(0);
            System.out.println("#"+tc+" "+ result);
        }
    }
}
