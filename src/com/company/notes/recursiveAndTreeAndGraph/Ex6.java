package com.company.notes.recursiveAndTreeAndGraph;

public class Ex6 {
    static int n;
    static int[] ch;    //스위치 용도

    public void dfs(int l) {
        if (l == n + 1) {

        } else {
            ch[l] = 1;
            dfs(l + 1);   //왼쪽 가지 (o인 경우)
            ch[l] = 0;
            dfs(l + 1);   //오른쪽 가지 (x인 경우)
        }
    }

    public static void main(String[] args) {
        Ex6 T = new Ex6();
        n = 3;
        ch = new int[n + 1];
        T.dfs(1);
    }
}
