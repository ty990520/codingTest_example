package com.company.notes.recursiveAndTreeAndGraph;

import java.util.ArrayList;
import java.util.Scanner;

//인접리스트로 그래프 구현
public class Ex13 {
    static int n, m, result = 0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public void dfs(int v){
        if(v==n) result++;
        else{
            for (int linkedNode : graph.get(v)) {
                if(ch[linkedNode]==0){
                    ch[linkedNode] = 1;
                    dfs(linkedNode);
                    ch[linkedNode] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Ex13 T = new Ex13();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); //노드의 수
        m = scan.nextInt(); //행
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.dfs(1);
        System.out.println(result);
    }
}
