package com.company.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q1983 {
    static final String[] GRADE = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Student> list = new ArrayList<>();
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= n; i++) {
                initStudent(br, list, i);
            }
            Collections.sort(list);
            settingGrade(list, n);
            printResult(tc, list, k);
        }
    }

    private static void initStudent(BufferedReader br, List<Student> list, int i) throws IOException {
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int midT = Integer.parseInt(st.nextToken());
        int finalT = Integer.parseInt(st.nextToken());
        int homework = Integer.parseInt(st.nextToken());
        double total = midT * 0.35 + finalT * 0.45 + homework * 0.2;
        list.add(new Student(i, total));
    }

    private static void settingGrade(List<Student> list, int n) {
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            Student s = list.get(i);
            if (cnt == (n / 10)) {
                cnt = 1;
                idx++;
            } else {
                cnt++;
            }
            s.setGrade(GRADE[idx]);
        }
    }

    private static void printResult(int tc, List<Student> list, int k) {
        for (Student s : list) {
            if (s.id == k) {
                System.out.println("#" + tc + " " + s.grade);
                break;
            }
        }
    }

    static class Student implements Comparable<Student> {
        int id;
        double score;
        String grade;

        public Student(int id, double score) {
            this.id = id;
            this.score = score;
        }

        public void setGrade(String grade){
            this.grade = grade;
        }
        @Override
        public int compareTo(Student o) {
            return Double.compare(o.score,this.score);
        }
    }
}
