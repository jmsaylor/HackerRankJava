package com.johnmsaylor;

import java.util.*;

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

    public static boolean canSum(int target, int[] numbers) {
        boolean[] table = new boolean[target + 1];
        Arrays.fill(table, false);
        table[0] = true;
        for (int i = 0; i < target; i++) {
            if (table[i]) {
                for (int num : numbers) {
                    if (i + num <= target) {
                        table[i + num] = true;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(table));

        return table[target];
    }

    public static int[] howSum(int target, int[] numbers){
        int[][] table = new int[target + 1][];
        Arrays.fill(table,null);

        table[0] = new int[0];

        for (int i = 0; i < target; i++) {
            if (table[i] != null) {
                for (int num : numbers) {
                    if (i + num <= target) {
                        table[i + num] = Arrays.copyOf(table[i], table[i].length + 1);
                        table[i + num][table[i + num].length - 1] = num;
                    }
                }
            }
        }
        Arrays.stream(table).forEach(x -> System.out.println(Arrays.toString(x)));
        return table[target];
    }

    public static int[] bestSum(int target, int[] numbers){
        int[][] table = new int[target + 1][];
        table[0] = new int[0];

        for (int i = 0; i < target; i++) {
            if (table[i] != null) {
                int[] combination = Arrays.copyOf(table[i], table[i].length + 1);
                for (int num : numbers) {
                    if (table[i + num] == null || combination.length < table[num + 1].length) {
                        combination[combination.length - 1] = num;
                        table[i + num] = combination;
                    }
                }
            }
        }

        Arrays.stream(table).forEach(x -> System.out.println(Arrays.toString(x)));

        return null;
    }

    public static List<List<String>> allConstruct(String target, String[] wordbank) {
        List<List<String>>[] table = new List[target.length() + 1];
        table[0] = new ArrayList<>();
        table[0].add(new ArrayList<>());

        for (int i = 0; i <= target.length(); i++) {
            if(table[i] != null) {
                for (String word : wordbank){
                    if (target.substring(i).startsWith(word) && (i + word.length()) <= target.length()) {
                        if (table[i + word.length()] == null) {
                            table[i + word.length()] = new ArrayList<>();
                        }
                        for (List<String> previousMatches : table[i]) {
                            List<String> clone = new ArrayList<>(previousMatches);
                            clone.add(word);
                            table[i + word.length()].add(clone);
                        }
                    }

                }
            }
        }

//        System.out.println(Arrays.toString(table));
        return table[target.length()];
    }
}
