package com.company.notes.DFS.pg;

public class PG43162 {
    static int SIZE;
    static int[][] COMPUTERS;
    static boolean[] checked;   //방문배열은 꼭 2차원으로 만들 필요가 없음
    public int solution(int n, int[][] computers) {
        int answer = 0;
        COMPUTERS = computers;
        checked = new boolean[n];
        SIZE = n;
        for(int i=0; i<n; i++){
            if(!checked[i]){
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int node){
        checked[node] = true;

        for(int i=0; i<SIZE; i++){
            if(i!=node && !checked[i] && COMPUTERS[node][i] == 1){
                dfs(i);
            }
        }

    }
}
