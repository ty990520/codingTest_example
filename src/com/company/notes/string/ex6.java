//package com.company.notes;
//
//import com.company.Main;
//
//import java.util.Scanner;
//
//public class ex6 {
//    public String solution(String str) {
//        String answer="";
//
//        for (int i = 0; i < str.length(); i++) {
//            if(str.indexOf(str.charAt(i))==i) {
//                answer += str.charAt(i);
//            }
//        }
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        System.out.println(T.solution(str));
//    }
//}
