package com.company.notes.string.inf;

import java.util.Scanner;

public class Ex1 {
    public int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);   //char타입 upper

        for (char x : str.toCharArray()) {  //for-each에서는 우측 매개변수로 String을 사용하면 안됨
            if (x==t)answer++;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)==t)
//                answer++;
//        }
        return answer;
    }
    public static void main(String[] args) {
        // write your code here
        Ex1 T = new Ex1();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);  //String을 인덱스로 접근(char타입을 입력받기 위함)

        System.out.println(T.solution(str,c));
    }
}
