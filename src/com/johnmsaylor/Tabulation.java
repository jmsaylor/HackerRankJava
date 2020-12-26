package com.johnmsaylor;

import java.util.Arrays;

public class Tabulation {

    public static long fib(long n) {
        long[] table = new long[(int) n + 1];
        Arrays.stream(table).map(x -> 0L);
        table[1] = 1L;

        for (int i = 0; i < n; i++) {
            if (i + 2 <= n) table[i + 2] += table[i];
            if (i + 1 <= n) table[i + 1] += table[i];
        }

        System.out.println(Arrays.toString(table));

        return  table[(int)n];
    }
}
