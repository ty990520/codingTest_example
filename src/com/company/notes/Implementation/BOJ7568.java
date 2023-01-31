package com.company.notes.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            list.add(new Person(weight, height));
        }
        for (int i = 0; i < n; i++) {
            int score = 1;
            for (int j = 0; j < n; j++) {
                if (list.get(j).isBigger(list.get(i)) && i != j) {
                    score++;
                }
            }
            System.out.print(score + " ");
        }
    }

    static class Person {
        int weight;
        int height;

        Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public boolean isBigger(Person p) {
            return this.weight > p.weight && this.height > p.height;
        }
    }
}
