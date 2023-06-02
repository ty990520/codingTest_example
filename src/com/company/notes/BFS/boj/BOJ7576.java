package com.company.notes.BFS.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제이름 : 토마토 (2차원)
 * 알고리즘 분류 : 너비 우선 탐색
 * 메모리 : 154448KB
 * 시간 : 784ms
 */
public class BOJ7576 {
    static int[][] arr;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

    static int n, m, max = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m][n];
        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    list.add(new Integer[]{i, j});
                }
            }
        }
        Queue<Integer[]> queue = new LinkedList<>();
        for (Integer[] site : list) {
            queue.add(site);
        }
        bfs(queue);

        if (checkZero()) {
            System.out.println(-1);
        } else {
            System.out.println(max - 1);
        }

    }

    private static boolean checkZero() {    //0이 하나라도 존재하면 true
        for (int[] ints : arr) {
            for (int i : ints) {
                if (i == 0) return true;
            }
        }
        return false;
    }

    private static void bfs(Queue<Integer[]> queue) {
        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dirX[i];
                int y = poll[1] + dirY[i];
                if (x >= 0 && x < m && y >= 0 && y < n && arr[x][y] == 0) {
                    queue.add(new Integer[]{x, y});
                    arr[x][y] = arr[poll[0]][poll[1]] + 1;
                    max = Math.max(max, arr[x][y]);
                }
            }

        }
    }
}
