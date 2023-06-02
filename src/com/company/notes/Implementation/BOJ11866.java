package com.company.notes.Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 문제이름 : 요세푸스 문제 0
 * 알고리즘 분류 : 구현, 자료구조, 큐
 * 메모리 : 28044KB
 * 시간 : 264ms
 */
public class BOJ11866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        //큐 초기화
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        //출력할 문자열 만들기
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        //반복변수 설정 (k번째 요소를 선택하기 위함)
        int cnt = 1;

        //큐가 빌 때 까지 k번째 요소 poll
        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            if(cnt%k==0){
                sb.append(poll);
                if(!queue.isEmpty()) sb.append(", ");
            }else{
                queue.add(poll);
            }
            cnt++;
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
