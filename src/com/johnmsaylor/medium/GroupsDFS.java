package com.johnmsaylor.medium;

import java.util.*;

public class GroupsDFS {

    public static void test() {
        int[][] grid = new int[][]{{1, 1, 0, 1}, {0, 1, 1, 0}, {0, 0, 1, 0}, {1, 0, 0, 0}};

       int[][] grid2 = {  {0, 1, 0, 0, 0, 0, 1, 1, 0},
        {1, 1, 0, 0, 1, 0, 0, 0, 1},
    {0, 0, 0, 0, 1, 0, 1, 0, 0},
    {0, 1, 1, 1, 0, 1, 0, 1, 1},
    {0, 1, 1, 1, 0 ,0, 1, 1, 0},
    {0, 1, 0, 1, 1, 0, 1, 1, 0},
    {0, 1, 0, 0, 1, 1, 0, 1, 1},
    {1, 0, 1, 1, 1, 1, 0, 0, 0}};

        System.out.println(dfs(grid2));
    }

    public static int dfs(int[][] matrix) {
//        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
//        Arrays.fill(visited, false);
        for (var row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        int group = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    dfsUtil(matrix, i, j, group);
                    group++;

                    //logging
                    System.out.println("------------------------");
                    for (var row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }
                }
            }
        }

        //count group size
        Map<Integer, Integer> counters = new HashMap<>();

        for (var row : matrix) {
            for (var cell : row) {
                if (cell == 0) continue;
                if (!counters.containsKey(cell)) {
                    counters.put(cell, 1);
                } else {
                    counters.put(cell, counters.get(cell) + 1);
                }
            }
        }

        int result = 0;

        for (Integer groupCount : counters.keySet()) {
            result = Math.max(counters.get(groupCount), result);
        }
        System.out.println(counters);

        return result;
    }

    public static void dfsUtil(int[][] matrix, int row, int column, int group) {
        if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length) return;
        if (matrix[row][column] == 0 || matrix[row][column] > 1) return;

        matrix[row][column] = group;

        dfsUtil(matrix, row - 1, column, group);
        dfsUtil(matrix, row + 1, column, group);
        dfsUtil(matrix, row, column + 1, group);
        dfsUtil(matrix, row, column - 1, group);
        dfsUtil(matrix, row - 1, column + 1, group);
        dfsUtil(matrix, row + 1, column - 1, group);
        dfsUtil(matrix, row + 1, column + 1, group);
        dfsUtil(matrix, row - 1, column - 1, group);
    }

    static int connectedCell2(int[][] matrix) {
        int groupCount = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                //test for 0
                if(matrix[i][j] == 0){
                    continue;
                }
                //NE
                if (i != 0 && j < matrix[i].length) {
                    if(matrix[i-1][j+1] != 0){
                        matrix[i][j] = matrix[i-1][j+1];
                    }
                }
                //N
                if (i != 0) {
                    if(matrix[i-1][j] != 0){
                        matrix[i][j] = matrix[i-1][j];
                    }
                }
                //NW
                if (i != 0 && j != 0) {
                    if(matrix[i-1][j-1] != 0){
                        matrix[i][j] = matrix[i-1][j-1];
                    }
                }

                //W
                if(j != 0){
                    if(matrix[i][j-1] != 0){
                        matrix[i][j] = matrix[i][j-1];
                    }
                }


                if(matrix[i][j] != 1){
                    continue;
                } else {
                    groupCount++;
                    matrix[i][j] = groupCount;
                }
            }

        }

        for (var row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) continue;
                //E
                if (j < matrix[i].length - 1) {
                    if (matrix[i][j + 1] > 1 && matrix[i][j + 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i][j + 1];
                    }
                }
                //SE
                if (i < matrix.length - 1 && j < matrix[i].length - 1) {
                    if (matrix[i + 1][j + 1] > 1 && matrix[i + 1][j + 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j + 1];
                    }
                }

                //S
                if (i < matrix.length - 1) {
                    if (matrix[i + 1][j] > 1 && matrix[i + 1][j] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j];
                    }
                }

                //SW
                if (i < matrix.length - 1 && j != 0) {
                    if (matrix[i + 1][j - 1] > 1 && matrix[i + 1][j - 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j - 1];
                    }
                }

            }
        }

        Map<Integer, Integer> counters = new HashMap<>();

//        for (var row : matrix){
//            for (var cell : row) {
//                if (!counters.containsKey())
//
//            }
//        }

        for (var row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        return 0;
    }

    static int connectedCell(int[][] matrix) {
        int groupCount = 1;
        //pass 1
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                //test for 0
                if(matrix[i][j] == 0){
                    continue;
                }
                //NE
                if (i != 0 && j < matrix[i].length - 1) {
                    if(matrix[i-1][j+1] != 0){
                        matrix[i][j] = matrix[i-1][j+1];
                    }
                }
                //N
                if (i != 0) {
                    if(matrix[i-1][j] != 0){
                        matrix[i][j] = matrix[i-1][j];
                    }
                }
                //NW
                if (i != 0 && j != 0) {
                    if(matrix[i-1][j-1] != 0){
                        matrix[i][j] = matrix[i-1][j-1];
                    }
                }
                //W
                if(j != 0){
                    if(matrix[i][j-1] != 0){
                        matrix[i][j] = matrix[i][j-1];
                    }
                }
                if(matrix[i][j] != 1){
                    continue;
                } else {
                    groupCount++;
                    matrix[i][j] = groupCount;
                }
            }
        }
         for (var row : matrix) {
             System.out.println(Arrays.toString(row));
         }
        //pass 2
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) continue;
                //E
                if (j < matrix[i].length - 1) {
                    if (matrix[i][j + 1] > 1 && matrix[i][j + 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i][j + 1];
                    }
                }
                //SE
                if (i < matrix.length - 1 && j < matrix[i].length - 1) {
                    if (matrix[i + 1][j + 1] > 1 && matrix[i + 1][j + 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j + 1];
                    }
                }
                //S
                if (i < matrix.length - 1) {
                    if (matrix[i + 1][j] > 1 && matrix[i + 1][j] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j];
                    }
                }
                //SW
                if (i < matrix.length - 1 && j != 0) {
                    if (matrix[i + 1][j - 1] > 1 && matrix[i + 1][j - 1] < matrix[i][j]) {
                        matrix[i][j] = matrix[i + 1][j - 1];
                    }
                }
            }
        }
        System.out.println("-----------------------------------------");
         for (var row : matrix) {
             System.out.println(Arrays.toString(row));
         }

        HashMap<Integer, Integer> groupMap = new HashMap<>();
        //pass 3
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    continue;
                }
                if(!groupMap.containsKey(matrix[i][j])){
                    groupMap.put(matrix[i][j], 1);
                } else {
                    groupMap.put(matrix[i][j], groupMap.get(matrix[i][j]) + 1);
                }
            }
        }
        int maxGroupCount = 0;
        for(int num : groupMap.keySet()){
            if(groupMap.get(num) > maxGroupCount){
                maxGroupCount = groupMap.get(num);
            }
        }
        return maxGroupCount;
    }


}
