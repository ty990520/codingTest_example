package com.company.notes.recursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {
    Node root;

    public int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if(cur.lt==null && cur.rt==null) return l;
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
            l++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Ex10 T = new Ex10();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.bfs(T.root));
    }
}
