package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bonetrousle {

    public static void main(String[] args) {
        System.out.println(bonetrousle(12, 8, 3));
    }

    public static List<Long> bonetrousle(long n, long k, int b) {
        // If n is less than lowest or greater than highest summations, add -1 to List and return List
        long lowestPossibleSummation = ((long) b * (b + 1)) / 2;
        long greatestPossibleSummation = k * b - (((long) (b - 1) * b) / 2);


        if (n < lowestPossibleSummation || n > greatestPossibleSummation) {
            return Arrays.asList(-1L);
        }


        // Initialize List of b length and set values to lowest possible

        List<Long> result = new ArrayList<>(b);

        for (int i = 1; i <= b; i++) {
            result.add((long) i);
        }



        // Initialize long totalSum = lowest summation
        long totalSum = lowestPossibleSummation;

        // Initialize long highestValue = k;
        long highestValue = k;

        // FOR value in List (working backward)
        for (int i = b - 1; i >= 0; i--) {
            // Initialize difference = k - totalSum
            long difference = n - totalSum > 0 ? n - totalSum : 0;
            long value = result.get(i);
            System.out.println(totalSum + " " + value + " " + difference + " " + highestValue);
            // if value + difference > highestValue
            if (value + difference > highestValue) {
                // set value to highestValue
                result.set(i, highestValue);
                // adjust totalSum
                totalSum += (highestValue - value);
                // set highestValue to this value - 1
                highestValue = highestValue - 1;
            } else {
                // else
                // set value to value + difference
                result.set(i, (value + difference));
                // break
                break;
            }

        }

        // return List
        return result;

    }
}

// If n is less than lowest or greater than highest summations, add -1 to List and return List

// Initialize List of b length and set values to lowest possible


// Initialize int totalSum = lowest summation
// Initialize int highestValue = k;

// FOR value in List (working backward)

// Initialize difference = k - totalSum
// if value + difference > highestValue
// set value to highestValue
// set highestValue to this value - 1
// else
// set value to value + difference
// break

// return List