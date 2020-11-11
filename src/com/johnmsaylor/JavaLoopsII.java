package com.johnmsaylor;

public class JavaLoopsII {


    public static void test(int a, int b, int n) {

        int[] results = new int[n];
        results[0] = a + b;

        for (int j = 1; j < n; j++) {
            results[j] = results[j - 1] + b * (int) Math.pow( 2, j);
        }

        for (int result : results) {
            System.out.print(result + " ");
        }

        System.out.println();
    }
}
