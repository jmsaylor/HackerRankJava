package com.johnmsaylor.medium;

import java.util.Arrays;

public class GreedyFlorist {

    public static int getMinimumCost(int k, int[] c) {

        Arrays.sort(c);

        int result = 0;
        int index = c.length;
        int counter = 0;

        while (index-- > 0){
            result += c[index] * ((counter / k) + 1);
            counter++;
            System.out.println(index + " " + c[index] + " " + result);
        }

        System.out.println(result);
        return result;
    }

}
