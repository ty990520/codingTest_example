package com.company.notes.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* BFS+백트래킹 --> 되긴 하지만 메모리 초과(Site마다 hashSet을 두개나 들고있기 때문) */
public class BOJ1987Fail {
    static char[][] board;
    static int[][] cntArr;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static int r, c, answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        board = new char[r][c];
        cntArr = new int[r][c];
        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        bfs();
        System.out.println(answer);
    }

    public static void bfs() {
        Queue<Site> queue = new LinkedList<>();
        HashSet<Character> alphabet = new HashSet<>(Arrays.asList(board[0][0]));
        queue.add(new Site(0, 0, alphabet, new HashSet<>()));
        cntArr[0][0] = 1;

        while (!queue.isEmpty()) {
            Site poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nowX = poll.x + dirX[i];
                int nowY = poll.y + dirY[i];
                if (nowX >= 0 && nowX < r && nowY >= 0 && nowY < c) {
                    if (!poll.isVisited(nowX, nowY) && !poll.set.contains(board[nowX][nowY])) {
                        cntArr[nowX][nowY] = cntArr[poll.x][poll.y] + 1;
                        answer = Math.max(answer, cntArr[nowX][nowY]);
                        HashSet<Character> newSet = new HashSet<>(poll.set);
                        newSet.add(board[nowX][nowY]);
                        Site newSite = setNewVisited(poll, nowX, nowY, newSet);
                        queue.add(newSite);
                    }
                }
            }


        }
    }

    private static Site setNewVisited(Site poll, int nowX, int nowY, HashSet<Character> newSet) {
        HashSet<Site> newVisited = new HashSet<>(poll.visited);
        newVisited.add(new Site(nowX, nowY));
        Site newSite = new Site(nowX, nowY, newSet, newVisited);
        return newSite;
    }

    static class Site {
        int x;
        int y;
        HashSet<Character> set;
        HashSet<Site> visited;

        public Site(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Site(int x, int y, HashSet<Character> set, HashSet<Site> visited) {
            this.x = x;
            this.y = y;
            this.set = set;
            this.visited = visited;
        }

        public boolean isVisited(int x, int y) {
            return visited.contains(new Site(x, y));
        }
    }
}
