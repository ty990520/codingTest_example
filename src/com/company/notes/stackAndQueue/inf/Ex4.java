package com.company.notes.stackAndQueue.inf;

import java.util.Scanner;
import java.util.Stack;

public class Ex4 {
    public int calculator(int n1, int n2, char c){
        if(c=='+'){
            return n1+n2;
        }else if(c=='-'){
            return n1-n2;
        }
        else if(c=='*'){
            return n1*n2;
        }
        else if(c=='/'){
            return n1/n2;
        }
        return 0;
    }
    public int solution(String postfix){
        Stack<String> stack= new Stack<>();

        for (char c : postfix.toCharArray()) {
            if(Character.isDigit(c)){
                stack.push(c+"");
            }else{
                int num1 = Integer.parseInt(String.valueOf(stack.pop()));
                int num2 = Integer.parseInt(String.valueOf(stack.pop()));
                int returnNum = calculator(num2, num1, c);
                stack.push(returnNum+"");
            }
        }
        return Integer.parseInt(stack.pop());

    }
    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
