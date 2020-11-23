package com.johnmsaylor;
import com.johnmsaylor.medium.*;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(7);
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(5);
        bt.add(3);
        bt.add(9);
        bt.printTree();
        System.out.println();
        System.out.println(bt.lowestCommonAncestor(3,5));
        bt.printNode(bt.getRoot(), 4);

    }

}
