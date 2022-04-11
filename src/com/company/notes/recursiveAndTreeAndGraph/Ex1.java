package com.company.notes.recursiveAndTreeAndGraph;

import com.company.Main;

public class Ex1 {
    //재귀함수(스택프레임)
    public void dfs(int n) {
        if (n == 0) return;
        else {
            dfs(n - 1);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        T.dfs(3);
    }
}
