package com.company.notes.string.inf;

import java.util.Scanner;

public class Ex9_2 {
    public int solution(String str){
        String answer="";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)){
                answer = answer+c;
            }
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args){
        Ex9_2 T = new Ex9_2();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));

    }
}
