package com.company.notes.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        boolean[] visited;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            visited = new boolean[26];
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            char last = str.charAt(0);
            visited[last - 97] = true;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (last != c && visited[c - 97]) {
                    answer++;
                    break;
                }
                visited[c - 97] = true;
                last = c;
            }
        }
        System.out.println(n - answer);
    }
}
