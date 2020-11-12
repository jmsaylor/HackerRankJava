package com.johnmsaylor;

import java.util.Scanner;

public class ReadingInput {

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        while (scanner.hasNext()) {
            System.out.println(++index + " " + scanner.nextLine());
        }

        scanner.close();
    }
}
