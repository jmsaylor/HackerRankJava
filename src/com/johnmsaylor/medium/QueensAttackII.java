package com.johnmsaylor.medium;

public class QueensAttackII {

    public static int total(int start) {
        if (start < 0) return 0;

        return 1 + total(start - 1);
    }

    public static int singleDirection(int n, int r_q, int c_q, int[][] obstacles, String direction){
        if (r_q < 1 || c_q < 1 || r_q > n || c_q > n) return -1;

        if (obstacles.length > 0) {
            for (int[] obstacle : obstacles) {
                if (obstacle[0] == r_q && obstacle[1] == c_q) {
                    return -1;
                }
            }
        }
        switch (direction)
        {
            case "n":
                return 1 + singleDirection(n, r_q + 1, c_q, obstacles, direction);
            case "ne":
                return 1 + singleDirection(n, r_q + 1, c_q + 1, obstacles, direction);
            case "e":
                return 1 + singleDirection(n, r_q, c_q + 1, obstacles, direction);
            case "se":
                return 1 + singleDirection(n, r_q - 1, c_q + 1, obstacles, direction);
            case "s":
                return 1 + singleDirection(n, r_q - 1, c_q, obstacles, direction);
            case "sw":
                return 1 + singleDirection(n, r_q - 1, c_q - 1, obstacles, direction);
            case "w":
                return 1 + singleDirection(n, r_q, c_q - 1, obstacles, direction);
            case "nw":
                return 1 + singleDirection(n, r_q + 1, c_q - 1, obstacles, direction);
            default:
                return 0;
        }

    }

    public static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {


        int w = singleDirection(n, r_q, c_q, obstacles, "w");
        int nw = singleDirection(n, r_q, c_q, obstacles, "nw");
        int north = singleDirection(n, r_q, c_q, obstacles, "n");
        int ne = singleDirection(n, r_q, c_q, obstacles, "ne");
        int e = singleDirection(n, r_q, c_q, obstacles, "e");
        int se = singleDirection(n, r_q, c_q, obstacles, "se");
        int s = singleDirection(n, r_q, c_q, obstacles, "s");
        int sw = singleDirection(n, r_q, c_q, obstacles, "sw");

        return w + nw + north + ne + e + se + s + sw;
    }

    public static int queensAttackTest(int n, int k, int r_q, int c_q, int[][] obstacles) {
        if (r_q < 1 || c_q < 1 || r_q > n || c_q > n) return -1;

        for (int[] obstacle : obstacles) {
            if (obstacle[0] == r_q && obstacle[1] == c_q) {
                return -1;
            }
        }

        return 1 + queensAttackTest(n, k, r_q + 1, c_q, obstacles);
    }
}
