package com.company.notes.DP;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    static int n, m;
    static ArrayList<Question> list = new ArrayList<>();

    public static int solution() {
        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        Ex06 T = new Ex06();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int score = scan.nextInt();
            int time = scan.nextInt();
            list.add(new Question(score, time));
        }
        System.out.println(T.solution());
    }
}

class Question {
    int score;
    int time;

    public Question(int score, int time) {
        this.score = score;
        this.time = time;
    }
}
