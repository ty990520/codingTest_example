package com.company.notes.recursiveAndTreeAndGraph;

import com.company.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex8 {
    int[] dis={1,-1,5};
    Queue<Integer> queue = new LinkedList<>();

    public int solution(int s, int e){
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(s);
        list.add(s);
        int l = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int poll = queue.poll();
                for (int j = 0; j < dis.length; j++) {
                    int new_val = poll+dis[j];
                    if(new_val==e) return l+1;
                    if(!list.contains(new_val)){
                        queue.offer(new_val);
                        list.add(new_val);
                    }
                }
            }
            l++;
        }

        return 0;
    }
    public static void main(String[] args) {
        Ex8 T = new Ex8();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(T.solution(s,e));
    }
}
