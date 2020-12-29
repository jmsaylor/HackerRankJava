package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class EmaSupercomputer {

    public static void test() {
        var grid = "GGGGGG,GBBBGB,GGGGGG,GGBBGB,GGGGGG".split(",");

        for (String row : grid){
            System.out.println(row);
        }

        twoPluses(grid);
    }

    static int twoPluses(String[] grid) {
        List<int[][]> plusSigns = new ArrayList<>();

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length(); col++) {
                for (int[][] result : findPlus(row, col, grid)) {
                    plusSigns.add(result);
                }
            }
        }

        for (int[][] plusSign : plusSigns){
            Arrays.stream(plusSign).forEach(x -> System.out.print(Arrays.toString(x)));
            System.out.println();
        }

        return 0;
    }

    static List<int[][]> findPlus(int row, int col, String[] grid) {

        List<int[][]> result = new ArrayList<>();

        int size = 1;

        result.add(new int[][]{{row, col}});

        while ( row + size < grid.length &&
                row - size >= 0 &&
                col + size < grid[row].length() &&
                col - size >= 0 &&
                grid[row + size].charAt(col) == 'G' &&
                grid[row - size].charAt(col) == 'G' &&
                grid[row].charAt(col + size) == 'G' &&
                grid[row].charAt(col - size) == 'G'
        ) {
            System.out.println("hello");

            int[][] newArray = Arrays.copyOf(result.get(size - 1), (size * 4) + 1);
            newArray[newArray.length - 4] = new int[]{row + size, col};
            newArray[newArray.length - 3] = new int[]{row - size, col};
            newArray[newArray.length - 2] = new int[]{row, col + size};
            newArray[newArray.length - 1] = new int[]{row, col - size};

            result.add(newArray);
            size++;
        }

        return result;

    }

}
