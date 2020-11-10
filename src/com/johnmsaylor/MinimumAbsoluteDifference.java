package com.johnmsaylor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumAbsoluteDifference {

    public static void test(){
        int[] arr = new int[]{1,7,5};
        System.out.println(minimumAbsoluteDifference(arr));

    }

    public static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int currentMin = arr[1] - arr[0];
        for (int i = 1; i + 1 <= arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < currentMin) {
                currentMin = arr[i + 1] - arr[i];
            }
        }
        return currentMin;
    }

}
