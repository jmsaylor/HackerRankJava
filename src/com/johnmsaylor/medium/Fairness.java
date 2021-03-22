package com.johnmsaylor.medium;

import java.util.Arrays;
import java.util.OptionalInt;

public class Fairness {

    public static void test() {
        System.out.println(maxMin(3, new int[]{3, 2, 1, 5}));
    }

    static int maxMin(int k, int[] arr) {
        //sort array

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // calculate fairness of each window and log in table
        OptionalInt scanMin = Arrays.stream(Arrays.copyOfRange(arr, 0, k)).min();
        OptionalInt scanMax = Arrays.stream(Arrays.copyOfRange(arr, 0, k)).max();

        int min = scanMin.getAsInt();

        int max = scanMax.getAsInt();

        int fairness = max - min;

        for (int i = 1; i <= arr.length - k; i++) {
            if (arr[i - 1] == min) {
                scanMin = Arrays.stream(Arrays.copyOfRange(arr, i, (i + k))).min();
                min = scanMin.getAsInt();
            } else if (arr[i - 1] == max) {
                scanMax = Arrays.stream(Arrays.copyOfRange(arr, i, (i + k))).max();
                max = scanMax.getAsInt();
            }

            if (arr[(i + k) - 1] > max) {
                max = arr[(i + k) - 1];
            } else if (arr[(i + k) - 1] < min) {
                min = arr[(i + k) - 1];
            }

            if ((max - min) < fairness) {
                fairness = (max - min);
            }


        }


        return fairness;
    }
}
