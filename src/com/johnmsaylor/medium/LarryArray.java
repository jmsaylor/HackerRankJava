package com.johnmsaylor.medium;

public class LarryArray {
    public static String larrysArray(int[] A) {

        for (int i = 0; i < A.length - 2; i++) {
            int a = A[i];
            int b = A[i + 1];
            int c = A[i + 2];

            System.out.println(a + " " + b + " " + c);
            if (!((a < b && b < c) || (b < c && c < a) || (c < a && a < b))) return "NO";

        }

        return "YES";
    }
}
