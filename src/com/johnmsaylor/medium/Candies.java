package com.johnmsaylor.medium;

import java.util.Arrays;

public class Candies {

    public static void test(int students, int[] ratings) {

        System.out.println(Arrays.toString(ratings));
        System.out.println(Arrays.toString(getRightArray(ratings)));
        System.out.println(Arrays.toString(getLeftArray(ratings)));
        System.out.println(candies(students, ratings));

    }

    public static long candies(int students, int[] ratings) {
        int[] right = getRightArray(ratings);
        int[] left = getLeftArray(ratings);

        int[] resultArray = new int[ratings.length];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (right[i] > left[i]) ? right[i] : left[i];
        }

        int totalCandies = Arrays.stream(resultArray).sum();
        System.out.println(totalCandies);

        return totalCandies;

    }

    public static int[] getRightArray(int[] original) {
        int[] resultArray = new int[original.length];
        int incrementRun = 0;

        resultArray[0] = (original[0] > original[1]) ? ++incrementRun + 1 : 1;

        for (int i = 1; i < original.length; i++) {
            if (original[i] > original[i - 1]) {
                incrementRun++;
            } else {
                incrementRun = 0;
            }
            resultArray[i] = 1 + incrementRun;
        }

        return resultArray;
    }

    public static int[] getLeftArray(int[] original) {
        final int LAST = original.length - 1;
        int[] resultArray = new int[original.length];
        int incrementRun = 0;

        resultArray[LAST] = (original[LAST] > original[LAST - 1]) ? ++incrementRun + 1 : 1;

        for (int i = LAST - 1; i >= 0 ; i--) {
            if (original[i] > original[i + 1]) {
                incrementRun++;
            } else {
                incrementRun = 0;
            }
            resultArray[i] = 1 + incrementRun;
        }
        return resultArray;
    }

}