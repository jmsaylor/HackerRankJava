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

    public static int gridTraveller(int m, int n){
        int[][] grid = new int[m + 1][n + 1];
        Arrays.stream(grid).forEach(x -> Arrays.fill(x, 0));
        grid[1][1] = 1;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int current = grid[i][j];
                if (j + 1 <= n) grid[i][j + 1] += current;
                if (i + 1 <= m) grid[i + 1][j] += current;
            }
        }

        Arrays.stream(grid).forEach(x -> System.out.println(Arrays.toString(x)));

        return grid[m][n];
    }
}
