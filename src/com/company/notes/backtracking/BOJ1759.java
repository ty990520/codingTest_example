package com.company.notes.backtracking;

import java.io.*;
import java.util.*;

public class BOJ1759 {
    static char[] inputs, strArr;
    static int L,C;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
         L = Integer.parseInt(st.nextToken());
         C = Integer.parseInt(st.nextToken());
        inputs = new char[C];
        strArr = new char[L];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            inputs[i] = st.nextToken().charAt(0);
        }
        sb = new StringBuilder();
        Arrays.sort(inputs);
        dfs(0, 0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int level, int start){
        if(level==L){
            if(isPossible()){
                for (char c : strArr) {
                    sb.append(c);
                }
                sb.append("\n");
            }
        }else{
            for (int i = start; i <C ; i++) {
                    strArr[level] = inputs[i];
                    dfs(level+1, i+1);
            }
        }
    }

    public static boolean isPossible(){
        int vowel=0,  consonant=0;
        HashSet<Character> vowels =  new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for (char c : strArr) {
            if(vowels.contains(c)){
                vowel++;
            }else{
                consonant++;
            }
        }
        return vowel>=1 && consonant>=2;
    }
}

/* 참고
* https://yoon990.tistory.com/32
* */