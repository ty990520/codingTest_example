import java.io.*;
import java.util.Arrays;

public class Q1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < t; tc++) {
            int[] score = new int[101];
            int testNum = Integer.parseInt(br.readLine());
            String str = br.readLine();
            for (String s : str.split(" ")) {
                int i = Integer.parseInt(s);
                score[i]++;
            }
            bw.write("#"+testNum+" ");
            int max = Arrays.stream(score).max().getAsInt();
            for (int i = 100; i >=0; i--) {
                if(score[i]==max) {
                    bw.write(i+"");
                    break;
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

