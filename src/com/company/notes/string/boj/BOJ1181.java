package com.company.notes.string.boj;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!list.contains(str)) list.add(str);
        }

        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { //길이가 같으면 사전 순으로
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length(); //길이가 짧은 것부터
                }
            }
        });
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
