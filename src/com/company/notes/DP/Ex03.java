package com.company.notes.DP;

import java.util.Scanner;

public class Ex03 {
    static int[] arr;
    static int[] dy;

    public static int solution() {
        int answer = 0;

        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            //max에 걸리지 않는 경우가 있기 때문에 int max = Integer.MIN_VALUE;로 해주면 안됨

            for (int j = i -1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    max = Math.max(max, dy[j]);
                }
            }
            dy[i] = max+1;
        }


        for (int i : dy) {
            answer = Math.max(i,answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex03 T = new Ex03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arr = new int[n];
        dy = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution());
        ;
    }
}
