package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountLuck {

    public static void test() {
        String[] matrix = new String[]{
                ".X.X......X",
                ".X*.X.XXX.X",
                ".XX.X.XM...",
                "......XXXX."};

       char[][] grid = new char[matrix.length][];

        for (int row = 0; row < matrix.length; row++) {
            grid[row] = matrix[row].toCharArray();
        }

        var result = dfs(2,8, grid);

        result.forEach(x -> System.out.println(Arrays.toString(x)));
    }

    static String countLuck(String[] matrix, int k) {

        return null;
    }

    public static List<int[]> dfs(int row, int col, char[][] matrix) {
        if (row < 0 || col < 0 || !(row < matrix.length) || !(col < matrix[0].length)) return null;
        if (matrix[row][col] == 'M' || matrix[row][col] == 'X') return null;
        if (matrix[row][col] == '*') return null;
        matrix[row][col] = 'M';

//        history.add(new int[]{row, col});

        Arrays.stream(matrix).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println("-------------------------------");

        int[][] neighbors = new int[4][];
        neighbors[0] = new int[]{row + 1, col};
        neighbors[1] = new int[]{row, col + 1};
        neighbors[2] = new int[]{row - 1, col};
        neighbors[3] = new int[]{row, col - 1};

        for (int[] neighbor : neighbors) {
            dfs(neighbor[0], neighbor[1], matrix);
        }

        return null;
    }

}
