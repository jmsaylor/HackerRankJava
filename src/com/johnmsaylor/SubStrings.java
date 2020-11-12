package com.johnmsaylor;

import java.util.Arrays;
import java.util.Collections;

public class SubStrings {

    public static void test(String s, int k) {
        String smallest = "";
        String largest = "";

        final int STRING_LENGTH = s.length();
        final int SUBSTRING_LENGTH = k;
        final int ITERABLE_LENGTH = STRING_LENGTH - SUBSTRING_LENGTH + 1;

        String[] temp = new String[ITERABLE_LENGTH];

        for (int index = 0; index < ITERABLE_LENGTH; index++) {
                temp[index] = s.substring(index, index + SUBSTRING_LENGTH);
        }

//        System.out.println(Arrays.toString(temp));

        Arrays.sort(temp);

        smallest = temp[0];
        largest = temp[temp.length - 1];

        System.out.println(smallest);
        System.out.println(largest);
    }
}
