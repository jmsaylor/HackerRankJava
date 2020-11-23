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

    public int lowestCommonAncestor(int value1, int value2) {
        Node result = lca2(getRoot(), value1, value2);
        return result.data;
    }

    public Node lca2(Node root, int value1, int value2){
        while (root != null) {
            if (root.data < value1 && root.data < value2) {
                root = root.right;
            } else if (root.data > value1 && root.data > value2) {
                root = root.left;
            } else {
                break;
            }
        }
        return root;
    }

    public Node lca(Node root, int value1, int value2) {

        if (root.data < value1 && root.data < value2) {
            return lca(root.right, value1, value2);
        } else if (root.data > value1 && root.data > value2) {
            return lca(root.left, value1, value2);
        } else {
            return root;
        }
    }

    public void printTree() {
        printTree(getRoot());
    }


    public void printNode(Node root, int find) {
        if (root.data == find) {
            int dataLeft = root.left != null ? root.left.data : 0;
            int dataRight = root.right != null ? root.right.data : 0;
            System.out.println(root.data + " " + dataLeft + " " + dataRight);
        }
        if (root.left != null) {
            printNode(root.left, find);
        }
        if (root.right != null) {
            printNode(root.right, find);
        }

    }

    public void printTree(Node root) {
        System.out.print(root.data);
        if (root.left != null) {
            printTree(root.left);
        }
        if (root.right != null) {
            printTree(root.right);
        }
    }

    public Node getRoot() {
        return root;
    }
}
