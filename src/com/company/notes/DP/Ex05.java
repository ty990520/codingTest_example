package com.company.notes.DP;

import java.util.Scanner;

public class Ex05 {
    static int[] dy;
    static int[] coinType;

    public static int solution(int value) {
        int answer = 0;
        dy = new int[value + 1];
        //dy[i] == i 금액을 만드는데 드는 최소 동전 개수

        for (int i = 0; i < dy.length; i++) {
            dy[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < coinType.length; i++) {
            for (int j = coinType[i]; j < dy.length; j++) {
                dy[j - coinType[i]]
                if (Math.min()) {
                    dy[] =
                }

            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Ex05 T = new Ex05();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        coinType = new int[n];

        for (int i = 0; i < n; i++) {
            coinType[i] = scan.nextInt();
        }

        int value = scan.nextInt();

        T.solution(value);
    }
}
