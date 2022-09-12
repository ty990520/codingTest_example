package com.company.notes.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1547 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,Integer> map = new HashMap<>();
        //초기화 (컵번호, 인덱스)
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int cupA = Integer.parseInt(stringTokenizer.nextToken());
            int cupB = Integer.parseInt(stringTokenizer.nextToken());

            int tmp = map.get(cupA);
            map.put(cupA,map.get(cupB));
            map.put(cupB,tmp);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
