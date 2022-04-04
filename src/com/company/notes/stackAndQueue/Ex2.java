package com.company.notes.stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public String solution(String str){
        String result = "";

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
            if(c==')'){
                while(stack.peek()!='('){
                    stack.pop();
                }
                stack.pop();
            }
        }
        for (Character c : stack) {
            result += c;
        }

        return result;
    }
    public static void main(String[] args) {
        Ex2 T = new Ex2();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
