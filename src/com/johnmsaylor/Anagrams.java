package com.johnmsaylor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void test(String a, String b) {
        boolean result = true;
        final String A = a.toLowerCase();
        final String B = b.toLowerCase();
        Map<Character, Integer> countA = new HashMap<>();
        Map<Character, Integer> countB = new HashMap<>();

        System.out.println(A);
        System.out.println(B);

        if (a.length() == b.length()) {

            for (int i = 0; i < B.length(); i++) {
                Character LETTER = B.charAt(i);

                if (countB.containsKey(LETTER)){
                    int letterCount = countB.get(LETTER);
                    countB.put(LETTER, ++letterCount);
                } else {
                    countB.put(LETTER, 1);
                }
            }

            for (int i = 0; i < A.length(); i++) {
                Character LETTER = A.charAt(i);




                if (countA.containsKey(LETTER)){
                    int letterCount = countA.get(LETTER);
                    countA.put(LETTER, ++letterCount);
                } else {
                    countA.put(LETTER, 1);
                }
            }

            System.out.println(countA.toString());
            System.out.println(countB.toString());

            for (Character key : countA.keySet()) {
                if (countA.get(key) != countB.get(key)) {
                    result = false;
                    break;
                }
            }

            for (Character key : countB.keySet()) {
                if (countB.get(key) != countA.get(key)) {
                    result = false;
                    break;
                }
            }

        } else {
            result = false;
        }

        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}
