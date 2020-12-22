package com.johnmsaylor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NestedLogic {

    public static int calculate(String actualRaw, String expectedRaw) {
        int lateFees = 0;

        List<Integer> actual = Arrays.stream(actualRaw.split(" ")).map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        List<Integer> expected = Arrays.stream(expectedRaw.split(" ")).map(x -> Integer.parseInt(x)).collect(Collectors.toList());

        if (actual.get(2) < expected.get(2)) {
            lateFees = 0;
        } else if (actual.get(2) > expected.get(2)) {
            lateFees = 10_000;
        } else if (actual.get(1) > expected.get(1)) {
            lateFees = (actual.get(1) - expected.get(1)) * 500;
        } else if (actual.get(0) > expected.get(0)) {
            lateFees = (actual.get(0) - expected.get(0)) * 15;
        }

        return lateFees;
    }

    public static void test() {
        System.out.println(calculate("31 12 2009", "1 1 2010"));
    }
}
