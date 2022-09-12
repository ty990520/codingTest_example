package com.company.notes.boj;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1598 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        Point pointA = makeNumToPoint(a);
        Point pointB = makeNumToPoint(b);
        System.out.println((int) (Math.abs(pointB.getX() - pointA.getX()) + Math.abs(pointB.getY() - pointA.getY())));
    }

    private static Point makeNumToPoint(int n) {
        int x = 0, y = 0;
        if (n % 4 == 1) {
            x = n / 4 + 1;
            y = 4;
        } else if (n % 4 == 2) {
            x = n / 4 + 1;
            y = 3;
        } else if (n % 4 == 3) {
            x = n / 4 + 1;
            y = 2;
        } else if (n % 4 == 0) {
            x = n / 4;
            y = 1;
        }
        return new Point(x,y);
    }


}
