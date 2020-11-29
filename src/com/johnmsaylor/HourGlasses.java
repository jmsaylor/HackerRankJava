package com.johnmsaylor;

import java.util.Arrays;

public class HourGlasses {
    public static void test() {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int[][] arr2 = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
            };

        maxHourGlass(arr);

    }

    public static void maxHourGlass(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;

        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr[i].length - 3; j++) {
                tempSum = 0;
                tempSum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                tempSum += arr[i + 1][j + 1];
                tempSum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        System.out.println(maxSum);
    }
    }

