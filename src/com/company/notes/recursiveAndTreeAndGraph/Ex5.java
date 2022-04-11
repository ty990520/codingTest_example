package com.company.notes.recursiveAndTreeAndGraph;

//이진트리 순회(DFS:깊이우선탐색)

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Ex5 {
    Node root;

    public void dfs(Node root) {
        if(root==null) return;
        else{
            System.out.print(root.data+" ");//전위
            dfs(root.lt);
//            System.out.print(root.data+" ");//중위
            dfs(root.rt);
//            System.out.print(root.data+" ");//후위
        }
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.dfs(T.root);
    }
}
