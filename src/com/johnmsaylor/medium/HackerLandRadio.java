
package com.johnmsaylor.medium;

import java.util.*;

//https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
//Find minimum number of transmitters
//11/12-  last attempt
public class HackerLandRadio {

        public static int minimumTransmitters(int[] houses, int range) {

            return 0;
        }

}

//Arrays.sort(locations);
////        int[][] transmitters = new int[locations[locations.length - 1] - locations[0]/range][];
////        for (int location : locations) {
////            int sector = location / range;
////            transmitters[sector][transmitters[sector].length] = location;
////        }
//
//        java.util.Arrays.sort(locations);
//        int maxDistanceMarker = locations[0];
//        List<Integer> towers = new ArrayList<>();
//
//        for (int index = 0; index < locations.length; index++) {
//            if (maxDistanceMarker < locations[index] - range) {
//                int recentTransmitter = locations[index - 1];
//                towers.add(recentTransmitter);
//                while (locations[index] < recentTransmitter + range && index < locations.length - 1) {
//                    maxDistanceMarker = locations[++index];
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(locations) + range);
//
//        for (int transmitter : towers) {
//            System.out.print(transmitter + " ");
//        }
//
//        System.out.println();
//        return towers.size();
//        return 0;
