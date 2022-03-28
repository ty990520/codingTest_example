package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex12 {
    public int solution(int numOfStu, int numOfTest, int[][] ranks) {
        int result = 0;

        for (int i = 0; i < numOfStu; i++) {
            for (int j = 0; j < numOfStu; j++) {
                int cnt=0; //3번 채워야함
                for (int k = 0; k < numOfTest; k++) {
                    int menti=0, mento = 0;
                    for (int s = 0; s < numOfStu; s++) {
                        if(ranks[k][s]==i+1) mento = s;
                        if(ranks[k][s]==j+1) menti = s;
                    }
                    if (mento<menti) cnt++;   //등수는 작아야 높은거
                }
                if(cnt==numOfTest) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex12 T = new Ex12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println(T.solution(n, m, array));
    }
}
