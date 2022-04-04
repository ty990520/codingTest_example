package com.company.notes.hashMapAndTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
    public ArrayList<Integer> solution(int days, int[] items) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashItem = new HashMap<>();

        int lt = 0;

        for (int i = 0; i < days-1; i++) {
            hashItem.put(items[i],hashItem.getOrDefault(items[i],0)+1);
        }

        for (int rt = days-1; rt < items.length; rt++) {
            hashItem.put(items[rt],hashItem.getOrDefault(items[rt],0)+1);
            result.add(hashItem.size());
            hashItem.put(items[lt], hashItem.get(items[lt]) - 1);
            if(hashItem.get(items[lt])==0){
                hashItem.remove(items[lt]);
            }
            lt++;
        }
        return result;
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i : T.solution(k, nums)) {
            System.out.print(i + " ");
        }
    }
}
