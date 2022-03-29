package com.company.notes.twoPointerAndSlidingWindow;

import com.company.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public ArrayList<Integer> solution(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int arr1p=0;
        int arr2p=0;
        while (arr1p<arr1.length && arr2p<arr2.length){
            if (arr1[arr1p]==arr2[arr2p]){
                result.add(arr1[arr1p]);
                arr1p++; arr2p++;
            }
            else if(arr1[arr1p]<arr2[arr2p]){
                arr1p++;
            }else{
                arr2p++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Ex2 T= new Ex2();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }
        for (int i : T.solution(arr1, arr2)) {
            System.out.print(i+" ");
        }
    }
}
