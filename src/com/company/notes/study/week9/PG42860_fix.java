package com.company.notes.study.week9;

public class PG42860_fix {
    public static void main(String[] args) {
        PG42860_fix test = new PG42860_fix();
        System.out.println(test.solution("BBBBBBAAA"));
    }

    public int solution(String name) {
        int answer = 0;

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i)-'A',26-name.charAt(i)-'A');

        }
        return answer;
    }
}
