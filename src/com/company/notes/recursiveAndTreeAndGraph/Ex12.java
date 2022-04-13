package com.company.notes.recursiveAndTreeAndGraph;

import java.util.Scanner;

//인접행렬로 그래프 구현
public class Ex12 {
    static int n, m, result = 0;
    static int[][] graph;
    static int[] ch;    //1이면 이미 방문한 노드, 0이면 방문 가능한 노드

    //깊이 우선 탐색 (백트래킹)
    public void dfs(int v) {
        if (v == n) result++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i]==0) {
                    ch[i]=1;
                    dfs(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ex12 T = new Ex12();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); //노드의 수
        m = scan.nextInt(); //행
        graph = new int[n][m];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a][b] = 1; //가중치없는 방향 그래프
        }
        ch[1] = 1;    //ch[0]은 사용하지 않음
        T.dfs(1);
        System.out.println(result);
    }
}
