package com.company.notes.DFS.pg;

public class PG43162 {
    static int[][] computers;
    static boolean[] visited;
    static int n;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        this.computers = computers;
        this.n = n;
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int level) {
        visited[level] = true;

        for (int i = 0; i < n; i++) {
            if (i != level && !visited[i] && computers[level][i] == 1) {
                dfs(i);
            }
        }
    }
}
