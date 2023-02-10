package com.company.notes.string.inf;

import java.util.Scanner;

public class Ex8_1 {
    public String solution(String str){
        String answer="";
        String original = str.toLowerCase();

        int lt = 0, rt = str.length()-1;
        char[] reversed = str.toLowerCase().toCharArray();

        while (lt<rt){
            if(!Character.isAlphabetic(reversed[lt])){
                lt++;
            }else if(!Character.isAlphabetic(reversed[rt])){
                rt--;
            }else{
                char tmp = reversed[lt];
                reversed[lt] = reversed[rt];
                reversed[rt] = tmp;
                lt++;
                rt--;
            }
        }

        if(original.equals(String.valueOf(reversed))){
            answer = "YES";
        }else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args){
        Ex8_1 T = new Ex8_1();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
