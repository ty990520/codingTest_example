package com.company.notes.boj;

import java.util.Scanner;

public class Q1717 {
    static int n, m;
    static int[] group;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();


        group = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            group[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int operFlag = scan.nextInt();
            // 0:union, 1:find
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (operFlag == 0) {
                union(a, b);
            } else {
                checkSame(a, b);
            }

        }
    }

    private static void checkSame(int a, int b) {
        if (find(a) == find(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /* union 연산 전에 find연산을 먼저 수행해야 함 */
    private static void union(int a, int b) {
        a = find(a);    //a의 대표 노드를 a에 저장
        b = find(b);    //b의 대표 노드를 b에 저장
        if (a != b)
            group[b] = a;
    }

    private static int find(int a) {
        if (a == group[a]) return a;
        else return group[a] = find(group[a]);  //경로 압축
    }
}
