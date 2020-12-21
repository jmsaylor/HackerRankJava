package com.johnmsaylor.medium;

public class Primality {

    public static boolean linearTime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean halfTime(int n){
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i < n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean logTime(int n){
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 3; i <= squareRoot; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
