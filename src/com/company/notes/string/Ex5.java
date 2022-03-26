package com.company.notes.string;

import java.util.Scanner;

public class Ex5 {
    public String solution(String str) {
        String answer = "";
        int lt = 0, rt = str.length() - 1;
        char[] chars = str.toCharArray();

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[rt];
                chars[rt] = chars[lt];
                chars[lt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
