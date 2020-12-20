package com.johnmsaylor;

import java.util.HashMap;

public class Memoization {

    public static Long fib(Long n, HashMap<Long, Long> memo){
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1L;
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }

    public static boolean canSum(int target, int[] numbers, HashMap<Integer, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return true;
        if (target < 0) return false;

        for (int number : numbers) {
            int remainder = target - number;
            if (canSum(remainder, numbers, memo)) {
                memo.put(target, true);
                return true;
            }
        }
        memo.put(target, false);
        return false;
    }

    public static Long gridTraveller(int n, int m, HashMap<String, Long> memo) {
        String key = n + "," + m;

        if (memo.containsKey(key)) return memo.get(key);
        if (n == 1 && m == 1) return 1L;
        if (n == 0 || m == 0) return 0L;

        memo.put(key, gridTraveller(n - 1, m, memo) + gridTraveller(n, m - 1, memo));
        return memo.get(key);
    }
}
