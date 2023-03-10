package com.company.notes.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ15686 {
    static ArrayList<Site> house, chicken;
    static boolean[] checked;
    static int n, m, answer=Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        house = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 1) {
                    house.add(new Site(i, j));
                } else if (val == 2) {
                    chicken.add(new Site(i, j));
                }
            }
        }
        checked = new boolean[chicken.size()];
        dfs(0,0);
        System.out.println(answer);
    }

    public static void dfs(int level, int start) {
        if(level==m){
            answer=Math.min(answer, getAvgOfDist());
            return;
        }
        for (int i = start; i < chicken.size(); i++) {
            if(!checked[i]){
                checked[i] = true;
                dfs(level+1, i+1);
                checked[i] = false;
            }
        }
    }

    public static int getAvgOfDist(){
        int sum=0;

        for (int i = 0; i < checked.length; i++) {
            if(checked[i]){
                for (Site site : house) {
                    site.updateMinDist(site.getDistance(chicken.get(i)));
                }
            }
        }
        for (Site site : house) {
            sum+=site.minDist;
            site.initMinDist();
        }
        return sum;
    }
    static class Site {
        int x;
        int y;
        int minDist=Integer.MAX_VALUE;

        public Site(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void initMinDist(){
            minDist=Integer.MAX_VALUE;
        }

        public void updateMinDist(int dist){
            minDist = Math.min(minDist,dist);
        }

        int getDistance(Site s) {
            return Math.abs(this.x - s.x) + Math.abs(this.y - s.y);
        }
    }
}
