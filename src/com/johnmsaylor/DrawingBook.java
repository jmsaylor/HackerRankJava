package com.johnmsaylor;

public class DrawingBook {

    public static void test() {

    }

    static int pageCount(int n, int p) {
        boolean fromBack = n - p < p - 1;
        int diff = Math.min(n - p, p - 1);

        int result = 0;
        if (fromBack && n % 2 != 0){
            result = diff / 2;
        } else if ( p == 1 || (n % 2 == 0 && p >= (n -1))) {
            result = 0;
        } else {
            result = diff % 2 != 0 ? (diff/2) + 1 : diff / 2;
        }

        return result;
    }
}
