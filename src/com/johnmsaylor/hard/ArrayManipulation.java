package com.johnmsaylor.hard;

import java.util.Arrays;

public class ArrayManipulation {
    public static void test(){
        System.out.println(arrayManipulation(10, new int[][]{{1,5,3},{4,8,7},{6,9,1}}));
    }

    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        Arrays.fill(arr, 0);
        for (int [] query : queries){
            arr[query[0] - 1] += query[2];
            if (query[1] < n) arr[query[1]] -= query[2];
//            System.out.println(Arrays.toString(arr));
        }
        long result = 0;
        long temp = 0;

        for (long num : arr) {
            temp += num;
            result = Math.max(result, temp);
        }
        return result;
    }
}
