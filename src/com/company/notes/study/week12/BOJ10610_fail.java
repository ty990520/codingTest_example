package com.company.notes.study.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
* 30
* */
public class BOJ10610_fail {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();
        for (char c : br.readLine().toCharArray()) {
            nums.add(Integer.parseInt(c + ""));
        }
        int size = nums.size();
        StringBuilder sb = new StringBuilder();

        Collections.sort(nums, Collections.reverseOrder());
        for (Integer num : nums) {
            sb.append(num);
        }
        String str = new String(sb);
        for (int i = size - 2; i >= 0; i--) {
            int next = i + 1;

            while (next < size) {
                if (Integer.parseInt(str) % 30 == 0) {
                    System.out.println(str);
                    return;
                }
                char temp = str.charAt(i);

                sb = new StringBuilder(str);
                sb.setCharAt(i, str.charAt(next));  //sb.setCharAt(인덱스, 문자);
                sb.setCharAt(next, temp);
                str = sb.toString();
                next++;
            }
        }
        System.out.println(-1);
    }
}
