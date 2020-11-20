package com.johnmsaylor;

public class WeirdNumbers {

    public static void solve(int N) {
        final boolean EVEN = N % 2 == 0;

        if (EVEN && N >= 2 && N <= 5 || EVEN && N > 20) {
            System.out.println("Not Weird");
        } else if (!EVEN ||  N >= 6) {
            System.out.println("Weird");
        }
    }
}
