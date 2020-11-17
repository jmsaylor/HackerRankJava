package com.johnmsaylor.medium;

//https://www.hackerrank.com/challenges/bonetrousle/problem

import java.util.Arrays;

public class CompositeNumbers {

    public static long[] bonetrousle(long neededSticks, long maxStickCount, int boxRequirement ) {


    }

    public static long[] attempt1(long neededSticks, long maxStickCount, int boxRequirement ) {
        final int AVERAGE = (int) (neededSticks / boxRequirement);
        final boolean NEEDED_STICKS_EVEN = (neededSticks % 2 == 0);
        final boolean BOX_REQUIREMENT_EVEN = (boxRequirement % 2 == 0);
        final int DISTANCE = boxRequirement / 2;

        if (AVERAGE - DISTANCE < 1 || AVERAGE + DISTANCE > maxStickCount) {
            return new long[]{-1}; //FAILS
        }

        long[] resultArray = new long[boxRequirement];
        int resultIndex = 0;
        logBools(NEEDED_STICKS_EVEN, BOX_REQUIREMENT_EVEN);
        if (BOX_REQUIREMENT_EVEN) {
            if (NEEDED_STICKS_EVEN) {
//
                for (long i = AVERAGE - DISTANCE; i <= AVERAGE + DISTANCE; i++) {
                    if (i == AVERAGE + DISTANCE) {
                        i += neededSticks % boxRequirement;
                    }
                    if (i != AVERAGE) {
                        resultArray[resultIndex++] = i;
                    }
                    System.out.println(Arrays.toString(resultArray));
                }
            } else {
                //ODD
                for (long i = AVERAGE - DISTANCE; i <= AVERAGE + DISTANCE; i++) {
                    if (i == AVERAGE + DISTANCE) {
                        i += neededSticks % boxRequirement;
                    }
                    if (i != AVERAGE) {
                        resultArray[resultIndex++] = i;
                    }
                    System.out.println(Arrays.toString(resultArray));
                }

            }
        } else {
            if (NEEDED_STICKS_EVEN) {
//                System.out.println(AVERAGE);
//                System.out.println(DISTANCE);
                for (long i = AVERAGE - DISTANCE; i <= AVERAGE + DISTANCE; i++) {
                    if (i == AVERAGE + DISTANCE) {
                        i += neededSticks % boxRequirement;
                    }

                    resultArray[resultIndex++] = i;
                    System.out.println(Arrays.toString(resultArray));
                }
            } else {
                for (long i = AVERAGE - DISTANCE; i <= AVERAGE + DISTANCE; i++) {
                    if (i == AVERAGE + DISTANCE) {
                        i += neededSticks % boxRequirement;
                    }

                    resultArray[resultIndex++] = i;

                    System.out.println(Arrays.toString(resultArray));
                }
            }
        }

        return resultArray;
    }

    public static void logBools(boolean sticksNeeded, boolean boxReq) {
        System.out.println("STICKS_NEEDED_EVEN: " + sticksNeeded + " BOX_REQ_EVEN: " + boxReq);
    }
}

// if (EVEN) {
//             for (long i = AVERAGE - DISTANCE; i < AVERAGE; i++) {
//                resultArray[resultIndex++] =  i;
//            }
//            for (long i = AVERAGE + 1; i <= AVERAGE + DISTANCE; i++) {
//                resultArray[resultIndex++] = i;
//            }
//        } else {
//            for (long i = AVERAGE - DISTANCE; i < AVERAGE; i++) {
//                resultArray[resultIndex++] = i;
//            }
//            for (long i = AVERAGE; i <= AVERAGE + DISTANCE; i++) {
//                resultArray[resultIndex++] = i;
//            }
//        }
