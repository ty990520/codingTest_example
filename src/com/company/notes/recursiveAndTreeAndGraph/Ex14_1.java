package com.company.notes.recursiveAndTreeAndGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex14_1 {
    static int n, m, result = 0;
    static ArrayList<ArrayList<Integer>> graph;
    Queue<Integer> queue = new LinkedList<>();
    int[] vertexLevel;

    public void bfs(int start, int end){
        ArrayList<Integer> list = new ArrayList<>();
        vertexLevel = new int[end+1];
        queue.offer(start);
        list.add(start);
        int level = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int poll = queue.poll();
                ArrayList<Integer> linkedNodes = graph.get(poll);

                for (int j = 0; j < linkedNodes.size(); j++) {
                     if(!list.contains(linkedNodes.get(j))){
                         vertexLevel[linkedNodes.get(j)] = level+1;
                         queue.offer(linkedNodes.get(j));
                         list.add(linkedNodes.get(j));
                     }
                }
            }
            level++;
        }

        for (int i = start+1; i < vertexLevel.length; i++) {
            System.out.println(i +" : "+vertexLevel[i]);
        }
    }
    public static void main(String[] args) {
        Ex14_1 T = new Ex14_1();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); //노드의 수
        m = scan.nextInt(); //행
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        T.bfs(1,n);
    }
}

/*
* 6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
* */