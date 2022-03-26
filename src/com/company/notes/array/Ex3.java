package com.company.notes.array;

import com.company.Main;

import java.util.Scanner;

public class Ex3 {
    public char[] solution(int num, int[]a, int[]b){
        char[] results = new char[num];
        //1:가위, 2:바위, 3:보
        for (int i = 0; i < num; i++) {
            //비기는 경우
            if(a[i]==b[i]){
                results[i] = 'D';
            }
            else{
                if(a[i]==1){          //가위
                    if(b[i]==2) results[i] = 'B';
                    else results[i] = 'A';
                }else if(a[i]==2){    //바위
                    if(b[i]==1) results[i] = 'A';
                    else results[i] = 'B';
                }else if(a[i]==3){    //보
                    if(b[i]==1) results[i] = 'B';
                    else results[i] = 'A';
                }
            }
        }
        return results;
    }

    public static void main(String[] args){
        Ex3 T= new Ex3();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < num; i++) {
            b[i] = scan.nextInt();
        }
        for (char c : T.solution(num,a,b)) {
            System.out.println(c);
        }
    }
}
