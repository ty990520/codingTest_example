package com.company.notes.Implementation;

import java.util.Scanner;

public class BOJ1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x == 1) {
            System.out.println("1/1");
            return;
        }
        int line = 1, sum = 1;
        while (sum < x) {
            line++;
            sum += line;
        }
        int i,j;
        if (line % 2 == 1) {
             i = (sum - x) + 1;  //분자
             j = line - sum + x; //분모 => line+1 == i+j 이므로 (line+1)-{(sum-x)+1}
        } else {
             i = line - sum + x;  //분자
             j = (sum - x) + 1; //분모
        }
        System.out.println(i + "/" + j);
    }
}
