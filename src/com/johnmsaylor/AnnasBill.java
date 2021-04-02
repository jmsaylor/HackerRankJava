package com.johnmsaylor;

import java.util.List;

public class AnnasBill {
    public static void test(){

    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);

        int annasBill = 0;

        for (int item : bill) {
            annasBill+=item;
        }

        annasBill = annasBill / 2;

        if (annasBill == b){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annasBill);
        }

    }

}
