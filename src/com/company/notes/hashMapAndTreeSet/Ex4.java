package com.company.notes.hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4 {
    public int solution(String str1, String str2){
        int result = 0;
        int lt = 0;
        int cnt=0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> str2Hash = new HashMap<>();
        char[] chars = str1.toCharArray();
        char[] str2_chars = str2.toCharArray();

        //str2를 먼저 별도의 해쉬에 저장
        for (int i = 0; i < str2.length(); i++) {
            str2Hash.put(str2_chars[i],str2Hash.getOrDefault(str2_chars[i],0)+1);
        }
        //str1에서 초기값 지정
        for (int i = 0; i < str2.length()-1; i++) {
            hashMap.put(chars[i],hashMap.getOrDefault(chars[i],0)+1);
        }
        for (int rt = str2.length()-1; rt < str1.length(); rt++) {
            hashMap.put(chars[rt],hashMap.getOrDefault(chars[rt],0)+1);
            for (Character c : str2Hash.keySet()) {
                if(hashMap.get(c)==str2Hash.get(c))
                    cnt++;
            }
            if(cnt==str2Hash.size()) result++;
            cnt=0;

            hashMap.put(chars[lt], hashMap.get(chars[lt]) - 1);
            if(hashMap.get(chars[lt])==0){
                hashMap.remove(chars[lt]);
            }
            lt++;
        }

        return result;
    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        System.out.println(T.solution(s,t));

    }
}
