package com.company.notes.stackAndQueue;

import com.company.Main;

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public String solution(String str){
        String result = "YES";

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if(c=='(') stack.push(c);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";

        return result;
    }
    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
