package com.johnmsaylor.main;
import com.johnmsaylor.Memoization;
import com.johnmsaylor.NestedLogic;
import com.johnmsaylor.medium.Primality;
import com.johnmsaylor.medium.QueensAttackII;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println(Memoization.bestSum(1000, new int[]{ 2, 3, 25, 150}, new HashMap<>()));

    }

}
