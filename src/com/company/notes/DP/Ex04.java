package com.company.notes.DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex04 {
    static ArrayList<Brick> list = new ArrayList<>();
    static int[] dy;

    public static int solution(int n) {
        int answer = 0;
        dy = new int[n];

        Collections.sort(list);

        dy[0] = list.get(0).height;

        for (int i = 1; i < n; i++) {
            int max = list.get(i).height;
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(i).weight > list.get(j).weight) {
                    max=Math.max(list.get(i).height+dy[j],max);
                }
            }
            dy[i] = max;
        }

        for (int i : dy) {
            answer = Math.max(i, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex04 T = new Ex04();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int width = scan.nextInt();
            int height = scan.nextInt();
            int weight = scan.nextInt();

            list.add(new Brick(width, height, weight));
        }


        System.out.println(T.solution(n));
    }
}

class Brick implements Comparable<Brick> {
    int width;
    int height;
    int weight;

    public Brick(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return this.width - o.width;
    }
}
