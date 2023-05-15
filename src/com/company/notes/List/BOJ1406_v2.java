package com.company.notes.List;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

/* LinkedList로 구현 */
public class BOJ1406_v2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
//        ListIterator<Character> iter = list.listIterator(/*처음 커서 위치*/);
        ListIterator<Character> iter = list.listIterator(list.size());

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            char command = s.charAt(0);
            if (command == 'P') {
                char c = s.charAt(2);
                iter.add(c);
            } else if (command == 'L') {
                if (iter.hasPrevious()) iter.previous();
            } else if (command == 'D') {
                if (iter.hasNext()) iter.next();
            } else if (command == 'B') {
                if (iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
            }
        }

        for (Character c : list) {
            bw.write(String.valueOf(c));
        }
        bw.flush();
        bw.close();
    }
}
