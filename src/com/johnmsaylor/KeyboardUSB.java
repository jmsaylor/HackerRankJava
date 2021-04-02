package com.johnmsaylor;

import java.util.ArrayList;

public class KeyboardUSB {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        ArrayList<int[]> maxPairs = new ArrayList<>();

        int[] currentMaxPair = {0, 0};
        int[] localMax = new int[2];
        for (int keyboard : keyboards){
            for (int drive : drives) {
                if (keyboard + drive < b) {
                    localMax[0] = keyboard;
                    localMax[1] = drive;
                    if (localMax[0] + localMax[1] > currentMaxPair[0] + currentMaxPair[1]){
                        currentMaxPair[0] = localMax[0];
                        currentMaxPair[1] = localMax[1];
                    }
                } else {
                    break;
                }
            }
            if (currentMaxPair[0] != 0){

                maxPairs.add(currentMaxPair);
            }
        }

        int result = 0;

        if (maxPairs.size() == 0) {
            result = -1;
        } else {
            for (int[] maxPair : maxPairs) {
                result = Math.max(result, maxPair[0] + maxPair[1]);
            }
        }

        return result;
    }
}
