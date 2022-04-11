package com.company.notes.recursiveAndTreeAndGraph;

import com.company.Main;

public class Ex2 {
    //재귀함수를 이용한 이진수 출력
    public void dfs(int n) {
        if (n==0) return;
        else {
            dfs(n / 2);
        }
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        Ex2 T = new Ex2();
        T.dfs(11);
    }
}
