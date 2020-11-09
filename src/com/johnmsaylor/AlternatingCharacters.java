package com.johnmsaylor;

public class AlternatingCharacters {

    static void test() {
        System.out.println(alternatingCharacters("ABB"));
    }

    static int alternatingCharacters(String s) {
        final int LENGTH = s.length();
        int minDeletions = 0;

        for (int i = 0; i + 1 < LENGTH; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                minDeletions++;
            }
        }
        return minDeletions;
    }

}
