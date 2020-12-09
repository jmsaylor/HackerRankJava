package com.johnmsaylor;

import java.util.Arrays;

public class Generics {

    public static <E> void printArray(E[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
