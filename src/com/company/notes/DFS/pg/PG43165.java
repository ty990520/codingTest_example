package com.company.notes.DFS.pg;

public class PG43165 {

    static int size;
    static int target;
    static int[] numbers;
    static boolean[] isPlus;
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        size = numbers.length;
        this.target = target;
        this.numbers = numbers;
        isPlus = new boolean[size];
        dfs(0);

        return answer;
    }

    public void dfs(int level) {
        if (level == size) {
            int result = 0;
            for (int i = 0; i < size; i++) {
                if (isPlus[i]) result += numbers[i];
                else result -= numbers[i];
            }
            if (result == target) answer++;
        } else {
            isPlus[level] = true;
            dfs(level + 1);
            isPlus[level] = false;
            dfs(level + 1);
        }

    }
}
