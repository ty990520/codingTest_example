package com.company.notes.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ1744 {
    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();

        boolean existZero = false;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) plus.add(num);
            else if (num < 0) minus.add(num);
            else existZero = true;
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);

        findMax(plus);
        findMax(minus);
        int remain1 = getRemain(plus);
        int remain2 = getRemain(minus);
        if (existZero) answer += remain1;
        else answer += remain1 + remain2;

        System.out.println(answer);
    }

    private static int getRemain(List<Integer> plus) {
        return (plus.size() != 0) ? plus.get(0) : 0;
    }

    private static void findMax(List<Integer> plus) {
        while (plus.size() > 1) {
            answer += Math.max(plus.get(0) * plus.get(1), plus.get(0) + plus.get(1));
            plus.remove(1);
            plus.remove(0);
        }
    }
}
