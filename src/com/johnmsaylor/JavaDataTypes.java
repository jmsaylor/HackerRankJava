package com.johnmsaylor;

public class JavaDataTypes {

    public static void test() {
        long[] tests = {100, 1000, 100000, 1000000000, (long) (Math.pow(2,63) - 10000)};

        for (long test : tests) {
            test(test);
        }
    }

    public static void test(long number) {
        System.out.println(number + "can fit into: ");
        if (number >= -128 && number <= 127) System.out.println("byte");
        if (number >= -32_768 && number <= 32_767) System.out.println("short");
        if (number >= -Math.pow(2,31) && number <= Math.pow(2,31) - 1) System.out.println("integer");
        if (number >= -Math.pow(2,63) && number <= Math.pow(2,63) - 1) System.out.println("long");
    }
}
