package com.johnmsaylor.medium;

import java.util.Arrays;

public class MinimumSwaps {

    public static void test() {
        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}));
    }

    static int minimumSwaps(int[] arr) {
        //Using Selection sort to find minimum number of swaps
        int swapCounter = 0;

        int min;
        int minIndex = 0;
        int swap;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) continue;
            min = arr[i];
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (min < arr[i]) {
                swapCounter++;
                swap = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = swap;
//                System.out.println(Arrays.toString(arr));
            }
        }

        return swapCounter;
    }
}
