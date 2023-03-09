package com.company.notes.stackAndQueue.inf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex8 {
    class Patient {
        int id;
        int priority;

        Patient(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int size, int seq, int[] patients) {
        int result = 1;
        Queue<Patient> queue = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            queue.offer(new Patient(i, patients[i]));
        }

        while(!queue.isEmpty()){
            Patient target = queue.poll();
            for (Patient patient : queue) {
                if(patient.priority > target.priority){
                    queue.offer(target);
                    target = null;
                    break;
                }
            }
            if(target!=null){
                if(target.id==seq) return result;
                else result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Ex8 T = new Ex8();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
