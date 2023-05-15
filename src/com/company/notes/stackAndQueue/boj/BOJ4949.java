package com.company.notes.stackAndQueue.boj;

import java.io.*;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        while(true){
            String str = br.readLine(); /*일단 이렇게 넣어보고 반례 있으면 수정하기 -> 문자열은 개행문자가 아니라 온점으로 끝나야함*/
            if(str.equals(".")){
                return;
            }
            for (char c : str.toCharArray()) {
                if(!stack.isEmpty() && c==')' && stack.peek()=='('){
                     stack.pop();
                }else if(!stack.isEmpty() && c==']' && stack.peek()=='['){
                    stack.pop();
                }else if(c=='(' || c=='[' || c==')' || c==']'){
                    stack.push(c);
                }
            }
            if(stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
            stack.clear();
        }
    }
}
