//package com.company.notes;
//
////import com.company.Main;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ex4_2 {
//    public ArrayList<String> solution(String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String s : str) {
//            char[] chars = s.toCharArray();
//            int lt = 0, rt = chars.length-1;
//            while (lt<rt){
//                /* lt와 rt를 변경 */
//                char tmp = chars[rt];
//                chars[rt] = chars[lt];
//                chars[lt] = tmp;
//                lt++;
//                rt--;
//            }
//            answer.add(String.valueOf(chars));
//        }
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        ex4_2 T = new ex4_2();
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
