package com.company.notes.dataStructure.map;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ25757 {
    public static void main(String[] args) throws IOException {
        HashSet<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char type = st.nextToken().charAt(0);
        int needNum = 0;
        switch (type) {
            case 'Y': needNum = 1; break;
            case 'F': needNum = 2; break;
            case 'O': needNum = 3; break;
        }
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        System.out.println(set.size()/needNum);
    }
}
