//package com.company.notes;
//
//import com.company.Main;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ex4_1 {
//    public ArrayList<String> solution(String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String s : str) {
//            answer.add(new StringBuilder(s).reverse().toString());
//        }
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner scan = new Scanner(System.in);
//        int cnt = scan.nextInt();
//        String[] str = new String[cnt];
//        for (int i = 0; i < cnt; i++) {
//            str[i] = scan.next();
//        }
//
//        for (String answer : T.solution(str)) {
//            System.out.println(answer);
//        }
//
//    }
//}
