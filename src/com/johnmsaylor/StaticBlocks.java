package com.johnmsaylor;

import java.util.Scanner;

public class StaticBlocks {

    private static int B;

    static {
        Scanner scanner = new Scanner(System.in);
        B = 5 * scanner.nextInt();
    }

    public static int getB() {
        return B;
    }
}
