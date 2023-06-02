package com.company.notes.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * 문제이름 : 통계학
 * 알고리즘 분류 : 수학, 구현, 정렬
 * 메모리 : 67060KB
 * 시간 : 972ms
 */
public class BOJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // n은 홀수
        int[] arr = new int[n];     // 원배열
        Map<Integer, Integer> map = new HashMap<>();   // 빈도수 계산을 위한 배열

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //산술평균
        getAverage(arr);

        //중앙값
        getMedian(arr);

        //최빈값
        getMode(arr, map);

        // 범위
        getRange(arr);
    }

    private static void getMode(int[] arr, Map<Integer, Integer> map) {
        Arrays.stream(arr).forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));
        Integer freq = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getValue();
        List<Integer> keyList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == freq) {
                keyList.add(entry.getKey());
            }
        }
        if (keyList.size() == 1) {
            System.out.println(keyList.get(0));
        } else {
            Collections.sort(keyList);
            System.out.println(keyList.get(1));
        }
    }

    private static void getMedian(int[] arr) {
        Arrays.sort(arr);
        int val = arr[arr.length / 2];
        System.out.println(val);
    }

    private static void getRange(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(max - min);
    }

    private static void getAverage(int[] arr) {
        double asDouble = Arrays.stream(arr).average().getAsDouble();
        long round = Math.round(asDouble);
        System.out.println(round);
    }
}
