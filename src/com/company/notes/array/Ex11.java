package com.company.notes.array;

import com.company.Main;

import java.util.HashSet;
import java.util.Scanner;

public class Ex11 {
    public int solution(int n, int[][] array) {
        int result = 0;
        int max = Integer.MIN_VALUE;

        int[] cnt = new int[n];

        for (int i = 0; i < n; i++) {
            HashSet<Integer> same_class_stu = new HashSet<>();  //중복 허용x
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == k)
                        continue;
                    if (array[i][j] == array[k][j]) {
                        //System.out.println(i+1+"번 학생은 "+(j+1)+"학년 때 "+(k+1)+"번 학생과 같은 반이었음");
                        same_class_stu.add(k+1);
                    }
                }
            }
            cnt[i] = same_class_stu.size();
        }

        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i]>max){
                result = i+1;
                max = cnt[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex11 T = new Ex11();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, array));
    }
}
