package com.company.notes.string;

import com.company.Main;

import java.util.Scanner;

public class ex2 {
    public String solution(String str) {

        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x))
                answer += Character.toUpperCase(x);
            else
                answer += Character.toLowerCase(x);
        }

        return answer;
    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//
//        System.out.println(T.solution(str));
//    }
}
