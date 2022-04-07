package com.company;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int num_of_prince, int number) {
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        //큐 초기화
        for (int i = 1; i < num_of_prince+1; i++) {
             queue.add(i);
        }
        while(queue.size()!=1){
            if(cnt%number==0){
                queue.remove();
            }else{
                queue.offer(queue.poll());
            }
            cnt++;
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(T.solution(n, k));
    }
}
