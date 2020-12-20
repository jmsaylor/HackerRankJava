package com.johnmsaylor.medium;

public class QueensAttackII {

    public static int total(int start) {
        if (start < 0) return 0;

        return 1 + total(start - 1);
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        if (r_q < 1 || c_q < 1 || r_q > n || c_q > n) return 0;

        for (int[] obstacle : obstacles) {
            if (obstacle[0] == r_q && obstacle[1] == c_q) {
                return 0;
            }
        }

        int w = 1 + queensAttack(n, k, r_q, c_q - 1, obstacles);
        int nw = 1 + queensAttack(n, k, r_q + 1, c_q - 1, obstacles);
        int north = 1 + queensAttack(n, k, r_q + 1, c_q, obstacles);
        int ne = 1 + queensAttack(n, k, r_q + 1, c_q + 1, obstacles);
        int e = 1 + queensAttack(n, k, r_q, c_q + 1, obstacles);
        int se = 1 + queensAttack(n, k, r_q - 1, c_q + 1, obstacles);
        int s = 1 + queensAttack(n, k, r_q - 1, c_q, obstacles);
        int sw = 1 + queensAttack(n, k, r_q - 1, c_q - 1, obstacles);

        return w + nw + north + ne + e + se + s + sw;
    }
}
