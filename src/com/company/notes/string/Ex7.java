package com.company.notes.string;

import java.util.Scanner;

public class Ex7 {
    public String solution(String str) {
        String answer="";
        String original = str.toLowerCase();

        int lt = 0, rt = str.length()-1;
        char[] reversed = str.toLowerCase().toCharArray();

        while (lt<rt){
            char tmp = reversed[lt];
            reversed[lt] = reversed[rt];
            reversed[rt] = tmp;
            lt++;
            rt--;
        }

        if(original.equals(String.valueOf(reversed))){
            answer = "YES";
        }else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex7 T = new Ex7();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
