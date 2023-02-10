package com.company.notes.string.inf;

import java.util.Scanner;

public class Ex10 {
    public int[] solution(String str, char input_c) {
        int[] answer= new int[str.length()];
        char[] chars = str.toCharArray();
        //왼쪽부터의 거리 계산
        int left_point = 1000; //초깃값은 충분히 큰 수로 지정
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==input_c)
                left_point = 0;
            else
                left_point++;
            answer[i] = left_point;
        }

//        //오른쪽부터의 거리 계산 후 비교 적용
        int right_point = 1000;
        for (int i = chars.length-1; i >= 0; i--) {
            if(chars[i]==input_c)
                right_point = 0;
            else
                right_point++;
            if(answer[i]>right_point){
                answer[i] = right_point;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Ex10 T = new Ex10();
        Scanner scan = new Scanner(System.in);
        String next = scan.next();
        char input_char = scan.next().charAt(0);
        for (int a : T.solution(next,input_char)) {
            System.out.print(a+" ");
        }
    }
}
