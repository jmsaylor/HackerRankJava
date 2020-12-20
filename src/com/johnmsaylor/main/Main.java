package com.johnmsaylor.main;
import com.johnmsaylor.Memoization;
import com.johnmsaylor.medium.QueensAttackII;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        System.out.println(Memoization.canSum(300, new int[]{7, 14}, new HashMap<>()));
    }

}
