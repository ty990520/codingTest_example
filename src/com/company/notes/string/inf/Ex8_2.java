package com.company.notes.string.inf;

import java.util.Scanner;

public class Ex8_2 {
    public String solution(String str){
        String answer="NO";
        String original = str.toUpperCase();

        int lt = 0, rt = str.length()-1;
        
        //A-Z가 아니면(^는 부정) 빈문자화 시켜버림
        String s = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp))
            answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        Ex8_2 T = new Ex8_2();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
