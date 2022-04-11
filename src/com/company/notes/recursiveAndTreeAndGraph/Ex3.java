package com.company.notes.recursiveAndTreeAndGraph;

public class Ex3 {
    //재귀함수 - 팩토리얼
    public int dfs(int n){
        if(n==1) return 1;
        else return n * dfs(n-1);
    }
    public static void main(String[] args) {
        Ex3 T = new Ex3();
        System.out.println(T.dfs(5));
    }
}
