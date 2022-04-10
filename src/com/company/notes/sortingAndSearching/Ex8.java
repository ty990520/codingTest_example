package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    //이진탐색
    public int solution(int num, int[] arr){
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        int mid = (end+start)/2;


        while(end>=start){
            if(arr[mid]==num)
                return mid+1;   //반환값은 1부터 시작
            else if(arr[mid]>num)
                end = mid-1;
            else
                start = mid+1;
            mid = (end+start)/2;
        }
        return -1;
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
        System.out.println(T.solution(m, arr));
    }
}
