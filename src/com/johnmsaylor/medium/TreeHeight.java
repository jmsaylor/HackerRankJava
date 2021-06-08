package com.johnmsaylor.medium;

public class TreeHeight {

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


        System.out.println(treeHeight(head));
    }

    public static int treeHeight(Node node) {
        return node == null ? 0 : Math.max(1 + treeHeight(node.left), 1 + treeHeight(node.right));
    }

    public static int treeHeightv1(Node node) {
        if (node == null) return 0;

        return treeHeight(node.left) > treeHeight(node.right)
                ?   1 + treeHeight(node.left)
                :   1 + treeHeight(node.right);

    }




}
