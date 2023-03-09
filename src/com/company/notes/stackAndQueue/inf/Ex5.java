package com.company.notes.stackAndQueue.inf;

import java.util.Scanner;
import java.util.Stack;

public class Ex5 {
    public int solution(String str){
        int result = 0;
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        stack.push(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]=='(') {
                stack.push(chars[i]);
            }
            else{
                if(chars[i-1]=='('){//레이저인 경우
                    stack.pop();
                    result += stack.size();
                }else{//쇠막대기의 끝인 경우
                    stack.pop();
                    result+=1;
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Ex5 T= new Ex5();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
