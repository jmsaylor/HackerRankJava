package com.johnmsaylor;

public class LinkedListNodes {

    public static Node newHead(int data) {
        return new Node(data);
    }

    class Node {
        Node next;
        int data;

        private Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node insert(Node head, int data) {
            //Complete this method
            if (head == null) {
                return new Node(data);
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(data);
            }
            return head;
        }
    }
}
