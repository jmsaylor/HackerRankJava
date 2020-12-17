package com.johnmsaylor;

import java.util.HashSet;
import java.util.Set;

public class LinkedListNodes {

//    public static Node newHead(int data) {
//        return new Node(data);
//    }

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

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node firstNode = head;
        Set<Integer> exists = new HashSet<>();
        Node previous = null;

        while (head != null) {
            if (exists.contains(head.data)) {
                previous.next = head.next;
                System.out.print(head.data + " ");
            } else {
                exists.add(head.data);
                previous = head;
            }
            head = head.next;
        }

        return firstNode;
    }
}
