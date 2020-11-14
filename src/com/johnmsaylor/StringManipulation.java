package com.johnmsaylor;

import java.util.Comparator;

public class StringManipulation {


    public static void test(String A, String B) {
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        String newA = A.substring(0,1).toUpperCase() + A.substring(1);
        String newB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(newA + " " + newB);
    }
}
