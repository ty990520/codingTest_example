//package com.company.notes;
//
//import com.company.Main;
//
//import java.util.Scanner;
//
//public class ex3 {
//
//    //방법1. split()
//    //방법2. indexOf() + substring()
//    public String solution(String str) {
//
//        String answer="";
//        int maxLength=Integer.MIN_VALUE;    //가장 작은 값으로 초기화
//
////        String[] array = str.split(" ");
////
////        for (String word : array) {
////            if(word.length()>maxLength){
////                answer=word;
////                maxLength = word.length();
////            }
////        }
//
//        int pos;
//        //띄어쓰기를 발견하면
//        while((pos=str.indexOf(' '))!=-1){
//            String tmp = str.substring(0,pos);  //0부터 pos까지 잘라냄
//            if(tmp.length()>maxLength){
//                answer=tmp;
//                maxLength = tmp.length();
//            }
//            str = str.substring(pos+1);
//        }
//        if(str.length()>maxLength) answer = str;
//
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();   //띄어쓰기를 사용하려면 next가 아니라 nextLine으로 적어줌
//
//        System.out.println(T.solution(str));
//    }
//}
