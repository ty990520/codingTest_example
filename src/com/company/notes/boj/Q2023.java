//package com.company.notes.boj;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Q2023 {
//    public static void main(String[] args) throws IOException {
//        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        dfs(2,1);
//        dfs(3,1);
//        dfs(5,1);
//        dfs(7,1);
//
//        int pow = (int)Math.pow(10, n-1);
//        System.out.println("1000="+pow);
//        System.out.println("9999="+((int)Math.pow(10, n)-1));
////
////        for (int i = (int) Math.pow(10,n); i < args.length; i++) {
////            String arg = args[i];
////
////        }
//    }
//
//    private static void dfs(int number, int index) {
//        if (index == n) {
//            if (isPrime(number)) {
//                System.out.println(number);
//            }
//            return;
//        }
//        for (int i = 1; i < 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            if(isPrime())
//        }
//    }
//
//    private static boolean isPrime(int num) {
//        for (int i = 2; i <= num/2; i++) {
//             = array[i];
//
//        }
//    }
//}
