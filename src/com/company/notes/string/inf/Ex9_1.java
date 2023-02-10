package com.company.notes.string.inf;

import java.util.Scanner;

public class Ex9_1 {
    public int solution(String str){
        int answer;
        String refined = str.toUpperCase().replaceAll("[A-Z]", "");
        answer = Integer.parseInt(refined);
        return answer;
    }
    public static void main(String[] args){
        Ex9_1 T = new Ex9_1();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));

    }
}
