package com.johnmsaylor;

import java.util.List;

public class SubArrayDivision {


    public static void test() {
        divisibleSumPairs(0, 3, new int[]{1, 3, 2, 6, 1, 2});


    }


    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for (int i = 0; i < s.size() - m; i++) {
            int counter = 0;
            for (int j = 0; j < m; j++) {
                counter += s.get(i + j);
            }
            if (counter == d) result++;
        }
        return result;
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;

        for (int i = 0; i <= ar.length - 2; i++) {
            for (int j = i + 1; j < ar.length; j++) {

                if ((ar[i] + ar[j]) % k == 0){
//                    System.out.print(ar[i] + " " + ar[j] + " : ");
                    result++;
                }
            }
        }
//        System.out.println(result);
        return result;
    }
}
