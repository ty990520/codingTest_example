package com.company.notes.hashMapAndTreeSet;

import com.company.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public char solution(String students){
        char result = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> cnt = new HashMap<>();
        for (char student : students.toCharArray()) {
            if(cnt.get(student)==null){
                cnt.put(student,0);
            }else
                cnt.put(student,cnt.get(student)+1);
        }

        for (Map.Entry<Character,Integer> entry : cnt.entrySet()) {
            if(entry.getValue()>max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Ex1 T= new Ex1();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String students="";
        students = scan.next();
        System.out.println(T.solution(students));
    }
}
