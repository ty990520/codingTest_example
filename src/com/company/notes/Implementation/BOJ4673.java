package com.company.notes.Implementation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ4673 {
    public static void main(String[] args) throws IOException {
        final int SIZE = 10000;
        boolean[] visited = new boolean[SIZE + 1];
        for (int i = 1; i <= SIZE; i++) {
            if (i >= 10) {
                int next = i;
                for (char c : String.valueOf(i).toCharArray()) {
                    next += Integer.parseInt(String.valueOf(c));
                }
                if (next <= SIZE)
                    visited[next] = true;
            } else {
                visited[i + i] = true;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= SIZE; i++) {
            if (!visited[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
