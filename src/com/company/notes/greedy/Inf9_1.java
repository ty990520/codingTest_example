package com.company.notes.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Inf9_1 {
    public static int solution(ArrayList<Body> list, int n) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        Collections.sort(list);

        for (Body body : list) {
            if (body.weight > max) {
                max = body.weight;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf9_1 test = new Inf9_1();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<Body> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int height = scan.nextInt();
            int weight = scan.nextInt();
            list.add(new Body(height, weight));
        }
        System.out.println(test.solution(list, n));
    }
}

class Body implements Comparable<Body> {
    int height;
    int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;  //내림차순
    }
}