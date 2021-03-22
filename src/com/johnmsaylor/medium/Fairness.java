package com.johnmsaylor.medium;

import java.util.Arrays;

public class Fairness {

    public static void test() {
        System.out.println(maxMin(3, new int[]{3, 2, 1, 5}));
    }

    static int maxMin(int k, int[] arr) {
        //sort array

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        //create table n - k

        int[] table = new int[(arr.length - k) + 1];

        // calculate fairness of each window and log in table

        for (int i = 0; i < table.length; i++) {
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                if(arr[i + j] > max) max = arr[i + j];
                if(arr[i + j] < min) min = arr[i + j];
            }
            table[i] = max - min;
        }

        System.out.println(Arrays.toString(table));
        //return minimum value from table

        int fairness = Integer.MAX_VALUE;

        for (int calculation : table) {
            if (calculation < fairness) {
                fairness = calculation;
            }
        }

        return fairness;
    }
}
