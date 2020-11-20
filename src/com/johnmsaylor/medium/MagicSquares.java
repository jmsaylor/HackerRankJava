package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquares {

    public static void test(int fourPlace) {
        // 0, 1, 2, 3, 4, 5, 6, 7, 8

        // 4, 3, 8,   9, 5, 1,   2, 7, 6
        // 4, 9, 2,   3, 5, 7,   8, 1, 6
        // 8, 1, 4,   7, 5, 3,   6, 9, 2
        // 2, 9, 4,   7, 5, 3,   6, 1, 8

        // 8, 1, 6,   3, 5, 7,   4, 9, 2
        // 2, 7, 6,   9, 5, 1,   4, 3, 8
        // 6, 1, 8,   7, 5, 3,   2, 9, 4
        // 6, 7, 2,   1, 5, 9,   8, 3, 4

    }

    public static int formingMagicSquare(int[][] s) {
        int[][] keys = new int[][]
                {
                        {
                                4, 3, 8, 9, 5, 1, 2, 7, 6
                        },
                        {
                                4, 9, 2, 3, 5, 7, 8, 1, 6
                        },
                        {
                                8, 3, 4, 1, 5, 9, 6, 7, 2
                        },
                        {
                                2, 9, 4, 7, 5, 3, 6, 1, 8
                        },

                        {
                                8, 1, 6, 3, 5, 7, 4, 9, 2
                        },
                        {
                                2, 7, 6, 9, 5, 1, 4, 3, 8
                        },
                        {
                                6, 1, 8, 7, 5, 3, 2, 9, 4
                        },
                        {
                                6, 7, 2, 1, 5, 9, 8, 3, 4
                        }
                };

        int[] original = new int[9];
        List<Integer> answers = new ArrayList<>(8);
        int counter = 0;

        for (int[] row : s) {
            for (int value : row) {
                original[counter++] = value;
            }
        }

        for (int [] key : keys) {
            int difference = 0;
            for (int index = 0; index < 9; index++) {
                difference += Math.abs((original[index] - key[index]));
            }
            answers.add(difference);
            System.out.println(Arrays.toString(key));
            System.out.println(difference);
        }
        System.out.println(answers);

        return answers.stream().min(Integer::compare).get();

    }
}
