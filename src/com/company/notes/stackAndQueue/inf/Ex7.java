package com.company.notes.stackAndQueue;

import com.company.Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex7 {
    public String solution(String requiredSub, String course) {
        String result = "NO";
        Queue<Character> queue = new LinkedList<>();
        for (char c : requiredSub.toCharArray()) {
            queue.offer(c);
        }
        for (char c : course.toCharArray()) {
            if(queue.contains(c)) {
                if(queue.peek().equals(c))
                    queue.poll();
                else
                    return result;
            }
        }

        if(queue.isEmpty()) result = "YES";
        return result;
    }

    public static void main(String[] args) {
        Ex7 T = new Ex7();
        Scanner scan = new Scanner(System.in);
        String requiredSub = scan.next();
        String course = scan.next();
        System.out.println(T.solution(requiredSub, course));
    }
}
