package com.company.notes.hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
    public String solution(String str1, String str2){
        String result="YES";
        HashMap<Character,Integer> str1_hash = new HashMap<>();
        HashMap<Character,Integer> str2_hash = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if(str1_hash.get(c)==null){
                str1_hash.put(c,1);
            }else{
                str1_hash.put(c,str1_hash.get(c)+1);
            }
        }
        for (char c : str2.toCharArray()) {
            if(str2_hash.get(c)==null){
                str2_hash.put(c,1);
            }else{
                str2_hash.put(c,str2_hash.get(c)+1);
            }
        }

        for (Character c : str2_hash.keySet()) {
            if(str2_hash.get(c)==null){
                result = "NO";
                break;
            }else if(str2_hash.get(c)!=str1_hash.get(c)){
                result = "NO";
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Ex2 T= new Ex2();
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(T.solution(str1,str2));
    }
}
