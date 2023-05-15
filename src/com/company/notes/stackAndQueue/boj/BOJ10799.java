package com.company.notes.stackAndQueue.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 레이저가 파이프를 자를 때 마다 현재 겹쳐진 파이프의 수만큼 추가됨
* 총 레이저가 자른 파이프의 수 + 만들어진 파이프의 수 = 잘려진 조각의 총 개수 */
public class BOJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int cnt = 0;    /* 현재 겹쳐진 파이프의 수 */
        int result = 0; /* 잘려진 조각의 총 개수 */
        int pipe = 0; /* 만들어진 파이프의 수 */
        char prevChar = 0;  /* 레이저인지 파이프인지 검증하기 위해 이전 문자를 저장 */

        for (char c : br.readLine().toCharArray()) {
            if(!stack.isEmpty() && c==')' && stack.peek()=='('){
                stack.pop();
                cnt--;
                if (prevChar == c) {
                    pipe++;
                } else {    /* 레이저인 경우만 잘려진 조각 추가 */
                    result+=cnt;
                }
            }else{  //스택이 비어있거나 stack.peek이 )인 경우
                stack.push(c);
                cnt++;
            }
            prevChar = c;
        }
        System.out.println(result+pipe);
    }
}
