package com.johnmsaylor;

import java.util.ArrayList;
import java.util.List;
//unidirectional
public class Node {
    int data;
    List<Node> connected;
    boolean visited;

    public Node(int data) {
        this.data = data;
        this.connected = new ArrayList<>();
        this.visited = false;
    }

    public void addNeighbor(Node node) {
        connected.add(node);
    }

    public List<Node> getNeighbors(){
        return connected;
    }

    public static void dfs(Node node){
        if (node.visited) return;
        System.out.println(node.data + " ");
        node.visited = true;
        for (Node neighbor : node.getNeighbors()){
            dfs(neighbor);
        }
    }

    public static void test() {

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addNeighbor(node10);
        node40.addNeighbor(node20);
        node10.addNeighbor(node30);
        node20.addNeighbor(node10);
        node20.addNeighbor(node30);
        node20.addNeighbor(node60);
        node20.addNeighbor(node50);
        node30.addNeighbor(node60);
        node60.addNeighbor(node70);
        node50.addNeighbor(node70);

        dfs(node40);
    }

}
