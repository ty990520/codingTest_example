package com.company.notes.recursiveAndTreeAndGraph;

public class Ex4 {
    //피보나치 재귀
    static int[] fibo;  //메모이제이션용 전역 변수

    public int dfs(int n) {
        if(fibo[n]!=0) return fibo[n];  //기록된 값이면 가져다 씀
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);

    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        int n = 45;
        fibo = new int[n+1];
        T.dfs(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
