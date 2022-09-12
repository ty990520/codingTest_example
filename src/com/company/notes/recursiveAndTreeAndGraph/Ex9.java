package com.company.notes.recursiveAndTreeAndGraph;

//트리의 말단 노드까지의 가장 짧은 경로(원래는 BFS로 푸는게 맞음)
//dfs로 구현하면 아래 코드와 같다
public class Ex9 {
    Node root;
    public int dfs(int l, Node root){
        if(root.lt== null && root.rt == null) return l; //노드가 루트 하나인 경우
        else return Math.min(dfs(l+1,root.lt), dfs(l+1,root.rt));
        
    }
    public static void main(String[] args) {
        Ex9 T = new Ex9();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.dfs(0,T.root));
    }
}
