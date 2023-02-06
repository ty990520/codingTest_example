package com.company.notes.DP.inf;

import java.util.Scanner;

public class Ex05 {
    static int n, m;
    static int[] dy;
    static int[] coinType;

    public static int solution() {
        dy = new int[m + 1];
        //dy[i] == i 금액을 만드는데 드는 최소 동전 개수

        for (int i = 0; i < dy.length; i++) {
            dy[i] = i;
        }

        for (int i = 0; i < coinType.length; i++) {
            for (int j = 1; j <= m; j++) {
                int quotient = j / coinType[i];
                int remainder = j % coinType[i];
                int num = dy[remainder] + quotient;
                if (dy[j] > num) {
                    dy[j] = num;
                }
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        Ex05 T = new Ex05();

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        coinType = new int[n];

        for (int i = 0; i < n; i++) {
            coinType[i] = scan.nextInt();
        }

        m = scan.nextInt();

        System.out.println(T.solution());
    }
}
