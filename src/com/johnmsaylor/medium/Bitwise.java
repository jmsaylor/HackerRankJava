package com.johnmsaylor.medium;

public class Bitwise {

    public static void test(int n, int k) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println("i:" + i + " j:" + j);
                System.out.println(i&j);
                int andResult = i&j;
                if (andResult > result && andResult < k) {
                    result = andResult;
                }
            }

        }
    }
}
