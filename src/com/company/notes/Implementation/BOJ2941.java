package com.company.notes.Implementation;

import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 0; i < alphabet.length; i++) {
            if(str.contains(alphabet[i])){
                str=str.replace(alphabet[i],"@");
            }
        }
        System.out.println(str.length());
    }
}

