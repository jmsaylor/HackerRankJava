package com.johnmsaylor;

import java.util.Scanner;

public class StaticBlocks {

    private static int B;

    static {
        try{
            Scanner scanner = new Scanner(System.in);
            int multiplier = scanner.nextInt();
            if (multiplier > 100) {
                throw new Exception("System Overloaded");
            }
            B = 5 * multiplier;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int getB() {
        return B;
    }
}
