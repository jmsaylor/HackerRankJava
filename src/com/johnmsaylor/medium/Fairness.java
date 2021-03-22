package com.johnmsaylor.medium;

import java.util.Arrays;
import java.util.OptionalInt;

public class Fairness {

    public static void test() {
        System.out.println(maxMin(3, new int[]{3, 2, 1, 5}));
    }

    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);

        int fairness = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            if (arr[(i + k) - 1] - arr[i] < fairness) {
                fairness = arr[(i + k) - 1] - arr[i];
            }
        }

        return fairness;
    }
}
