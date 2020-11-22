package com.johnmsaylor;
import com.johnmsaylor.medium.*;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(3);
        bt.add(45);
        bt.add(7);
        System.out.println(bt.getHeight(bt.getRoot()));
    }

}
