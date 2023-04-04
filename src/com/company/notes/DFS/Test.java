package com.company.notes.DFS;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/*11번가 코테 3번*/
public class Test {
    static int n, answer = 0;
    static String s;
    static char[] arr;
    static ArrayList<Integer> blankIdx;
    static boolean checked[];
    static Stack<Character> stack;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        s = scan.next();
        arr = new char[s.length()];
        blankIdx = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '?') blankIdx.add(i);
            else arr[i] = c;
        }
        checked = new boolean[blankIdx.size()];
        n = blankIdx.size();
        dfs(0, 0);
        System.out.println(answer);
    }

    public static void dfs(int level, int start) {
        if (level == n) {
            stack = new Stack<>();
            int cnt = 0;
            for (char c : arr) {
                if (stack.isEmpty()) {
                    cnt=0;
                    stack.push(c);
                } else if (!stack.isEmpty() && stack.peek() != c) {
                    stack.pop();
                    cnt=cnt+2;
                    answer = Math.max(cnt, answer);
                }else if(!stack.isEmpty() && stack.peek() == c){
                    stack.push(c);
                }
            }
            return;
        }

        for (int i = start; i < blankIdx.size(); i++) {
            if (!checked[i]) {
                arr[blankIdx.get(level)] = '<';
                checked[i] = true;
                dfs(level + 1, i);
                arr[blankIdx.get(level)] = '>';
                dfs(level + 1, i);
                checked[i] = false;
            }

        }


    }
}
