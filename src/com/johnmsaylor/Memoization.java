package com.johnmsaylor;

import java.util.HashMap;

public class Memoization {

    public static Long fib(Long n, HashMap<Long, Long> memo){
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1L;
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }

    public static boolean canSum(int target, int[] members) {
        if (target == 0) return true;
        if (target < 0) return false;

        for (int member : members) {
            if (canSum(target - member, members)) {
                return true;
            }
        }

        return false;
    }


}
