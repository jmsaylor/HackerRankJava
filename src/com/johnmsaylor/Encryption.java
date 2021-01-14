package com.johnmsaylor;

import java.util.Arrays;

public class Encryption {

    public static void test(){
        System.out.println("test");
        System.out.println(encryption("feedthedog"));
//        System.out.println(encryption("haveaniceday"));
    }

    static String encryption(String s) {
        double squareRoot = Math.sqrt(s.length());

        int rows = (int) Math.floor(squareRoot);
        int columns = (int) Math.ceil(squareRoot);

//        System.out.println(s.length() + " " + rows + " " + columns);

        if (rows * columns < s.length()) rows = columns;

        char[][] grid = new char[rows][columns];
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            grid[i/columns][i%columns] = s.charAt(i);
        }

        for (char[] row : grid){
            System.out.println(Arrays.toString(row));
        }

        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                if (grid[row][column] == Character.MIN_VALUE) continue;
                String toAdd = String.valueOf(grid[row][column]);
                result = result.concat(toAdd);
            }
            result = result.concat(" ");
        }

        return result;
    }
}
