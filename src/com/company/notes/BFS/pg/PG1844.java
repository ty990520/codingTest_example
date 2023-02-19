package com.company.notes.BFS.pg;

import java.util.LinkedList;
import java.util.Queue;

public class PG1844 {
    static int n, m;
    static boolean[][] checked ;
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        checked = new boolean[maps.length][maps[0].length];
        int answer = bfs(0,0, maps);
        return answer;
    }

    public int bfs(int x, int y, int[][] maps){
        int[] dirX = {0,0,1,-1};
        int[] dirY = {1,-1,0,0};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});

        while(!queue.isEmpty()){
            int[] e = queue.poll();

            for(int i=0; i<4; i++){
                if(dirX[i]+e[0]>=0 && dirX[i]+e[0]<n && dirY[i]+e[1]>=0 && dirY[i]+e[1]<m){
                    int nowX = dirX[i]+e[0];
                    int nowY = dirY[i]+e[1];
                    if(maps[nowX][nowY]==1 && !checked[nowX][nowY]){
                        queue.offer(new int[]{nowX, nowY});
                        checked[nowX][nowY] = true;
                        maps[nowX][nowY] = maps[e[0]][e[1]]+1;
                    }

                }
            }
        }
        int answer = maps[n-1][m-1];
        return answer>1? answer : -1;
    }
}
