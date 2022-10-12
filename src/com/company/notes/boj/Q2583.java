package com.company.notes.boj;

import java.util.*;

public class Q2583 {
    static int dirX[] = {0, 0, -1, 1};      //상하좌우
    static int dirY[] = {-1, 1, 0, 0};
    static int nowX, nowY;
    static int m, n, k;   //열, 행, 직사각형 수
    static int arr[][];
    static boolean visited[][];
    static ArrayList<Integer> cntArr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();
        k = scan.nextInt();

        arr = new int[m][n];
        visited = new boolean[m][n];
        cntArr = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            for (int a = y1; a < y2; a++) {
                for (int b = x1; b < x2; b++) {
                    arr[a][b] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && arr[i][j] == 0) {
                    cntArr.add(bfs(i, j));
                }
            }
        }
        System.out.println(cntArr.toArray().length);
        Collections.sort(cntArr);
        for (Integer cnt : cntArr) {
            System.out.print(cnt+" ");
        }
    }

    private static int bfs(int i, int j) {
        int cnt = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) {
                nowX = poll[0] + dirX[k];
                nowY = poll[1] + dirY[k];
                if (nowX >= 0 && nowX < m && nowY >= 0 && nowY < n) {
                    if (!visited[nowX][nowY] && arr[nowX][nowY] == 0) {
                        visited[nowX][nowY] = true;
                        cnt++;
                        queue.offer(new int[]{nowX, nowY});
                    }
                }
            }
        }
        return cnt;
    }
}
