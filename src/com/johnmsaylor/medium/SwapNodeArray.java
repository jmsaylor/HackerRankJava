package com.johnmsaylor.medium;

import java.util.Arrays;

public class SwapNodeArray {

    public static void test() {
        int[][] nodes1 = new int[][]{{2,3},
                {-1, 4},
                {-1, 5},
                {-1, -1},
                {-1, -1}};
        int[][] nodes2 = new int[][]{{2,3}};

        for (int[] arr : nodes1) {
            System.out.println(Arrays.toString(arr));
        }

        int[][] result = swapNodes(nodes1, new int[]{2});

        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[][] swapNodes(int[][] indexes, int[] queries) {

        int[][] results = new int[queries.length][];

        for (int query : queries){
            for (int i = query; Math.pow(2, i - 1) < indexes.length; i+=query) {
                int layerStart = (int) Math.pow(2, i - 1) - 1;
                int layerEnd = Math.min((int) Math.pow(2, i) - 1, indexes.length);
                System.out.println("start " + layerStart + " end " + layerEnd);
                while (layerStart < layerEnd) {
                    int temp = indexes[layerStart][0];
                    indexes[layerStart][0] = indexes[layerStart][1];
                    indexes[layerStart][1] = temp;
                    layerStart++;
                }
            }
        }

        return indexes;
    }


}
