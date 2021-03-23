package com.johnmsaylor.medium;

import java.util.Arrays;

public class MinimumSwaps {

    public static void test() {
        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}));
    }

    static int minimumSwaps(int[] arr) {

        int swapCounter = 0;
        int index = 0;

        while (index < arr.length) {
            if (arr[index] > index + 1) {
                int correctLocation = arr[index] - 1;
                int temp = arr[correctLocation];
                arr[correctLocation] = arr[index];
                arr[index] = temp;
                swapCounter++;
//                System.out.println(Arrays.toString(arr));
            } else index++;
        }


        return swapCounter;
    }
}
