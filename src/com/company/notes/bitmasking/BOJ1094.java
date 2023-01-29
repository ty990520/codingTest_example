package com.company.notes.bitmasking;

import java.util.Scanner;

public class BOJ1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); /* X는 64보다 작거나 같은 자연수 */
        System.out.println( Integer.bitCount(x));
    }
}
