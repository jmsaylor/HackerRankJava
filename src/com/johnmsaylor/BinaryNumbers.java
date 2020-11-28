package com.johnmsaylor;

import java.util.Deque;

public class BinaryNumbers {

    public static void byHand(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2);
            number = number / 2;
        }
        System.out.println(binary.reverse());
    }

    public static void builtIn(int number) {
        System.out.println(Integer.toBinaryString(number));
    }

    public static int longestOneSequence(int number) {
        String binary = Integer.toBinaryString(number);
        int result = 1;
        int currentRun = 0;
        for (char temp : binary.toCharArray()) {
            if (temp == '1') {
                currentRun++;
            } else {
                currentRun = 0;
            }
            result = Math.max(currentRun, result);
        }
        return result;
    }
}
