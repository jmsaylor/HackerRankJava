package com.johnmsaylor;

import java.util.Arrays;

public class MaxToys {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int total = 0;
        int toyCount = 0;
        int index = 0;
        while (index < prices.length && (total+=prices[index++]) < k) {
            toyCount++;
        }

        return toyCount;
    }
}
