package com.company.notes.bitmasking;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11723 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int s = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            int x = 0;
            if (!(op.equals("all") || op.equals("empty")))
                x = Integer.parseInt(st.nextToken());

            switch (op) {
                case "add":
                    s |= 1 << (x - 1);
                    break;
                case "remove":
                    s &= ~(1 << (x - 1));
                    break;
                case "check":
                    bw.write(((s & (1 << (x - 1))) == 0 ? 0 : 1) + "");
                    bw.newLine();
                    break;
                case "toggle":
                    s ^= 1 << (x - 1);
                    break;
                case "all":
                    s = (1 << 30) - 1;
                    break;
                case "empty":
                    s = 0;
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
