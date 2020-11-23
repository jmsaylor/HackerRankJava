package com.johnmsaylor;

public class Recursive {

    public static void range(int height) {
        System.out.println(height + " ");
        if (height > 0) {
            range(height - 1);
        } else {
            System.out.println();
        }
    }

    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static long fibonacci(long number) {
        System.out.print(number + " ");
        if ((number == 0) || (number == 1)) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
