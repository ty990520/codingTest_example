package com.company.notes.treeTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 트리 순회
* */
public class BOJ1991 {
    static Node head = new Node('A');   /* 항상 A가 루트 노드 */

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            insertNode(head, root, left, right);
        }

        preorder(head);
        System.out.println();
        inorder(head);
        System.out.println();
        postorder(head);
    }

    private static void preorder(Node node) {
        if (node != null) {
            System.out.print(node.val);
            preorder(node.left);
            preorder(node.right);
        }
    }

    private static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val);
            inorder(node.right);
        }
    }

    private static void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.val);
        }

    }

    private static void insertNode(Node node, char root, char left, char right) {
        if (node.val == root) {
            node.left = (left == '.') ? null : new Node(left);
            node.right = (right == '.') ? null : new Node(right);
        } else {
            if (node.left != null) insertNode(node.left, root, left, right);
            if (node.right != null) insertNode(node.right, root, left, right);
        }
    }

    static class Node {
        char val;
        Node left;
        Node right;

        Node(char val) {
            this.val = val;
        }
    }
}
