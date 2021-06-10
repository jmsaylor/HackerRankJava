package com.johnmsaylor.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeLayersBFS {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.right = new Node(6);
        head.right.right = new Node(7);
        head.left = new Node(1);


        levelOrder(head);
    }

    static void levelOrder(Node root){
        if (root == null) return;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        String result = "";

        while (!q.isEmpty()) {
            Node next = q.poll();
            result = result.concat(" " + next.value);
            if (next.left != null) q.add(next.left);
            if (next.right != null) q.add(next.right);
        }

        System.out.println(result.substring(1));

    }

}
