package com.company.notes.string.inf;

import java.util.Scanner;

public class Ex12 {
    public String solution(int num, String str){
        String result = "";
        String octal = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='#')
                octal+=1;
            else
                octal+=0;
        }

        int start_index = 0;
        for (int i = 0; i < num; i++) {
            String sub = octal.substring(start_index,start_index+7);
            start_index+=7;
            result+=(char)(int)Integer.valueOf(sub, 2);//10진수 변환 후 문자로 전환
        }
        return result;
    }
    public static void main(String[] args){
        Ex12 T = new Ex12();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        System.out.println(T.solution(num,str));
    }
}
