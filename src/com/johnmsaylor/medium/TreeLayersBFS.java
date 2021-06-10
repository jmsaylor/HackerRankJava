package com.johnmsaylor.medium;

import java.util.*;

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
        levelPrinter(Arrays.asList(head), "");
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

    static void levelPrinter(List<Node> nodes, String result) {
        List<Node> nextLevel = new ArrayList<>();

        for (Node node : nodes) {
            result = result.concat(" " + node.value);
            if (node.left != null) nextLevel.add(node.left);
            if (node.right != null) nextLevel.add(node.right);
        }

       if (nextLevel.isEmpty()) {
           System.out.println(result.substring(1));
       } else {
           levelPrinter(nextLevel, result);
       }
    }

}
