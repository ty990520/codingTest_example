package com.company.notes.study.week11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * 잃어버린 괄호
 * */
public class BOJ1541 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st1 = new StringTokenizer(br.readLine(), "-");
//        String temp = st1.nextToken();  //첫번째 토큰은 나중에 더해줌
//        int answer = 0;
//        while (st1.hasMoreTokens()) {
//            int val = 0;
//            val = sumSplitPlus(val, st1.nextToken());
//            answer -= val;
//        }
//
//        answer = sumSplitPlus(answer, temp);
//
//        System.out.println(answer);
//    }
//
//    private static int sumSplitPlus(int val, String s) {
//        StringTokenizer st2 = new StringTokenizer(s, "+");
//        while (st2.hasMoreTokens()) {
//            val += Integer.parseInt(st2.nextToken());
//        }
//        return val;
//    }


// 잃어버린 괄호

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;    // 초기 상태 여부 확인을 위한 값으로 설정
        String[] subtraction = br.readLine().split("-");


        for (int i = 0; i < subtraction.length; i++) {
            int temp = 0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            String[] addition = subtraction[i].split("\\+");

            // 덧셈으로 나뉜 토큰들을 모두 더한다.
            for (int j = 0; j < addition.length; j++) {
                temp += Integer.parseInt(addition[j]);
            }

            // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }

}
