//package com.company.notes.hashMapAndTreeSet;
//
//import com.company.Main;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Ex3 {
//    public ArrayList<Integer> solution(int days, int[] items){
//        int size = items.length-days+1;
//        ArrayList<Integer> result = new ArrayList<>();
//        HashMap<Integer,Integer> hashItem = new HashMap<>();
//
//
//        for (int i = 0; i < days; i++) {
//            if(hashItem.get(items[i])!=null)
//                hashItem.put(items[i],hashItem.get(items[i])+1);
//            else
//                hashItem.put(items[i],1);
//        }
//
//        result.add(hashItem.size());
//
//        for (int i = 1; i < size; i++) {
//            if(hashItem.get(items[i-1])==1)
//                hashItem.remove(items[i-1]);
//            else
//                hashItem.put(items[i-1],hashItem.get(items[i-1])-1);
//            if(hashItem.get(items[days+i-1])!=null)
//                hashItem.put(items[days+i-1],hashItem.get(items[i])+1);
//            else
//                hashItem.put(items[days+i-1],hashItem.get(1));
//            result.add(hashItem.size());
//        }
//
//        return result;
//    }
//    public static void main(String[] args) {
//        Ex3 T = new Ex3();
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int k = scan.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = scan.nextInt();
//        }
//        for (int i : T.solution(k,nums)) {
//            System.out.print(i+" ");
//        }
//    }
//}
