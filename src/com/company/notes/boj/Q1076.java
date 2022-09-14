package com.company.notes.boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

public class Q1076 {
    public static void main(String[] args) throws IOException {
        Q1076 T = new Q1076();
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String col1 = br.readLine();
        String col2 = br.readLine();
        String col3 = br.readLine();
        T.solution(col1, col2, col3);
    }

    private void solution(String col1, String col2, String col3) {
        HashMap<String, Data> dataHashMap = new HashMap<>();
        String colsStr[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < colsStr.length; i++) {
            dataHashMap.put(colsStr[i], new Data(i+"", (int) Math.pow(10, i)));
        }


        int valueSum = Integer.parseInt(dataHashMap.get(col1).value + dataHashMap.get(col2).value);
        BigInteger bigInteger = new BigInteger(String.valueOf(dataHashMap.get(col3).mulVal));
        System.out.println(bigInteger.multiply(BigInteger.valueOf(valueSum)));
    }
}
class Data {
    String value;
    int mulVal;

    public Data(String value, int mulVal) {
        this.value = value;
        this.mulVal = mulVal;
    }
}