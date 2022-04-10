package com.company.notes.sortingAndSearching;

import com.company.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
    static class Point implements Comparable<Point> {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) return this.y - o.y;    //오름차순 정렬
            return this.x - o.x;
//            if (this.x == o.x) return  o.y - this.y;    //내림차순 정렬
//            return o.x - this.x;
        }
    }

    public static void main(String[] args) {
        Ex7 T = new Ex7();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
