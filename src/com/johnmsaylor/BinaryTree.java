package com.johnmsaylor;

public class BinaryTree {

    private Node root = null;

    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void add(int data) {
//        if (root == null) {
//            root = new Node(data);
//        } else {
//            recursiveAdd(root, data);
//        }


        root = recursiveAdd(root, data);
    }

    private Node recursiveAdd(Node current, int data) {
        if (current == null) {
            return new Node(data);
        } else  if (data < current.data) {
            current.left = recursiveAdd(current.left, data);
        } else if (data > current.data) {
            current.right = recursiveAdd(current.right, data);
        }
        return current;
    }

    public int getHeight(Node root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

    public Node lca(Node root, int value1, int value2) {
        if (root.data < value1 && root.data < value2) {
            lca(root.right, value1, value2);
        } else if (root.data > value1 && root.data > value2) {
            lca(root.left, value1, value2);
        }

        return root;
    }

    public Node getRoot() {
        return root;
    }
}
