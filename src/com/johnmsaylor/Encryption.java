package com.johnmsaylor;

import java.util.Arrays;

public class Encryption {

    public static void test(){
        System.out.println("test");
        System.out.println(encryption("feedthedog"));
        System.out.println(encryption("haveaniceday"));
    }

    static String encryption(String s) {
        String result = "";

        int columns = (int) Math.ceil(Math.sqrt(s.length()));
        int rows = (columns - 1) * columns >= s.length() ? columns - 1 : columns;

        char[][] grid = new char[rows][columns];

        for (int i = 0; i < s.length(); i++) {
            grid[i/columns][i%columns] = s.charAt(i);
        }

        //TODO - combine w/ loop above - find result in one pass
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
