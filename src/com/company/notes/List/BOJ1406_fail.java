package com.company.notes.List;

import java.io.*;
import java.util.ArrayList;

/*
* ArrayList의 사용으로 인한 시간초과 (O(n))
* O(1)로 해결해야 한다! -> LinkedList(데이터 추가 및 삭제에 ArrayList보다 더 효율적임) + Iterator 조합으로 변경해야 함
* */
public class BOJ1406_fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        int cursor = str.length();

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            char command = s.charAt(0);
            if (command == 'P') {
                char c = s.charAt(2);
                list.add(cursor, c);
                cursor++;
            } else if (command == 'L') {
                if (cursor != 0) cursor--;
            } else if (command == 'D') {
                if (cursor != list.size()) cursor++;
            } else if (command == 'B') {
                if (cursor - 1 >= 0) list.remove(--cursor);
            }
        }

        for (Character c : list) {
            bw.write(String.valueOf(c));
        }
        bw.flush();
        bw.close();
    }
}