package com.company.notes.BFS.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제이름 : 토마토 (3차원)
 * 알고리즘 분류 : 너비 우선 탐색
 * 메모리 : 128496KB
 * 시간 : 740ms
 */
public class BOJ7569 {
    static int[][][] arr;
    static int[] dirX = {-1, 1, 0, 0, 0, 0};
    static int[] dirY = {0, 0, -1, 1, 0, 0};
    static int[] dirZ = {0, 0, 0, 0, -1, 1};

    static int n, m, h, max = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new int[h][n][m];
        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        list.add(new Integer[]{i, j, k});
                    }
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
        for (int[][] ints : arr) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    if (i == 0) return true;
                }
            }
        }
        return false;
    }

    private static void bfs(Queue<Integer[]> queue) {
        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();

            for (int i = 0; i < 6; i++) {
                int x = poll[0] + dirX[i];
                int y = poll[1] + dirY[i];
                int z = poll[2] + dirZ[i];
                if (x >= 0 && x < h && y >= 0 && y < n &&
                        z >= 0 && z < m && arr[x][y][z] == 0) {
                    queue.add(new Integer[]{x, y, z});
                    arr[x][y][z] = arr[poll[0]][poll[1]][poll[2]] + 1;
                    max = Math.max(max, arr[x][y][z]);
                }
            }

        }
    }
}
