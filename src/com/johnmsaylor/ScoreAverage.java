package com.johnmsaylor;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class ScoreAverage {

    public static void get(int[] scores) {
        OptionalDouble average = Arrays.stream(scores).average();
        final double numericGrade = average.orElse(0);
        char letterGrade;
        if (numericGrade < 40) {
            letterGrade = 'T';
        } else if (numericGrade < 55) {
            letterGrade = 'D';
        } else if (numericGrade < 70) {
            letterGrade = 'P';
        } else if (numericGrade < 80) {
            letterGrade = 'A';
        } else if (numericGrade < 90) {
            letterGrade = 'E';
        } else if (numericGrade <= 100) {
            letterGrade = 'O';
        } else {
            letterGrade = 'X';
        }
        System.out.println(letterGrade);
    }
}
