package com.company.notes;

public class Temp {
    public static void main(String[] args) {
        int a = 5;
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= (a * 2) - 1; j++) {
                if(i==(a+1)/2-1 && j>= (a - i) && count!=a){
                    System.out.print("*");
                    count++;
                }else{
                    if (j == (a - i) || j == (a + i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }
    }
}
//if(i==(a+1)/2-1 && j == (a - i) && count!=5){
//        System.out.print("*");
//        count++;