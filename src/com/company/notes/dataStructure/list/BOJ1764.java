package com.company.notes.dataStructure.list;

import java.io.*;
import java.util.*;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> hash = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            hash.put(br.readLine(), 1);
        }
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            hash.put(str, (hash.containsKey(str)) ? 2 : 1);
        }
        // 키(key) 값 기준으로 정렬하기
        hash.values().removeAll(Arrays.asList(1));
        List<String> keySet = new ArrayList<>(hash.keySet());
        Collections.sort(keySet);

        bw.write(keySet.size() + "\n");
        for (String s : keySet) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
// HashSet을 사용해도 됨! ArrayList는 안됨
// (HashSet의 contains()는 O(1), ArrayList의 contains()는 O(n)이다.)