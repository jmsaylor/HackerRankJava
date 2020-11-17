package com.johnmsaylor.medium;

import java.util.*;

public class TargetPairs {

    public static int pairs(int k, int[] arr) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();

        for (int number : arr) {
            if (!occurenceMap.containsKey(number)) {
                occurenceMap.put(number, 1);
            }
            else {
                int temp = occurenceMap.get(number);
                occurenceMap.put(number, ++temp);
            }
        }

        System.out.println(occurenceMap.toString());

        int result = 0;

        for (Integer key : occurenceMap.keySet()) {
            if (occurenceMap.containsKey(key + k)) {
                result += occurenceMap.get(key) * occurenceMap.get(key + k);
            }
        }

        return result;
    }

    public static int attempt1(int k, int[] arr) {
        int matchCounter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(" i: " + i + " j: " + j);
                if (Math.abs(arr[i] - arr[j]) == k)
                    matchCounter++;
            }
            System.out.println();
        }

        return matchCounter;
    }

}
