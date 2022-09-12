package com.company.notes.doitAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int originalArr[][] = new int[n + 1][n + 1];
        int sumArr[][] = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int element = Integer.parseInt(stringTokenizer.nextToken());
                originalArr[i][j] = element;
                if (i == 1 && j == 1) {
                    sumArr[i][j] = element;
                } else if (i == 1) {
                    sumArr[1][j] = sumArr[1][j - 1] + element;
                } else if (j == 1) {
                    sumArr[i][1] = sumArr[i - 1][1] + element;
                } else {
                    sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1] + element;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            //(x1,y1),(x2,y2)
            stringTokenizer = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(sumArr[x2][y2] - sumArr[x2][y1-1] - sumArr[x1-1][y2] + sumArr[x1-1][y1-1]);
            //(x2,y2) -> (x2,y1-1) (x1-1,y2) -> (x1-1, y1-1)

        }
    }
}
