package com.company.notes.recursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

//깊이 우선 탐색이 재귀함수를 사용했다면,
//넓이 우선 탐색은 큐 사용
public class Ex7 {
    Node root;

    public void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print("level"+l+" : ");
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null)
                    queue.offer(cur.lt);
                if (cur.rt != null)
                    queue.offer(cur.rt);
            }
            l++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Ex7 T = new Ex7();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.bfs(T.root);
    }
}
