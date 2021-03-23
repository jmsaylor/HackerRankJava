package com.johnmsaylor.hard;

import java.util.Arrays;

public class ArrayManipulation {
    public static void test(){
        System.out.println(arrayManipulation(10, new int[][]{{1,5,3},{4,8,7},{6,9,1}}));
    }

    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        Arrays.fill(arr, 0);


        for (int[] query : queries) {
            for(int i = query[0] - 1; i <= query[1] - 1; i++) {
                arr[i] = arr[i] + (long) query[2];
            }
        }

        long result = 0;

        for (long num : arr) {
            result = Math.max(result, num);
        }

        return result;
    }
}
