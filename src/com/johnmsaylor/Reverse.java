package com.johnmsaylor;

import java.util.Arrays;

public class Reverse {


    public static void test(int[] arr) {
        final int LENGTH = arr.length - 1;
        final int HALF = LENGTH / 2;
        int temp;

        System.out.println(Arrays.toString(arr));

        for (int index = 0; index < HALF; index++) {
            temp = arr[index];
            arr[index] = arr[LENGTH - index];
            arr[LENGTH - index] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
