package com.johnmsaylor;

import java.util.*;

public class DivisibleByEight {

    public static String test(String n) {
        boolean result = false;
        final int LENGTH = n.length();

        if (LENGTH == 1) {
            result = n.equals("8") || n.equals("0");
        } else if (LENGTH == 2) {
            result = Integer.parseInt(n) % 8 == 0
                    || Integer.parseInt(n.substring(1) + n.substring(0,1)) % 8 == 0;
        } else {

            Map<Character, Integer> digitMap = mapDigitCount(n);

            for (int i = 104; i < 1000; i+=8) {
                String currentNumber = Integer.toString(i);
                Map<Character, Integer> trueMap = mapDigitCount(currentNumber);
                boolean fail = trueMap.keySet().stream().anyMatch(x -> !digitMap.containsKey(x) || digitMap.get(x) < trueMap.get(x));
                if (!fail) {
                    result = true;
                    break;
                }
            }
        }

        return result ? "YES" : "NO";
    }

    public static Map<Character, Integer> mapDigitCount(String number){
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < number.length(); i++) {
            Character character = number.charAt(i);
            if (!counter.containsKey(character)) {
                counter.put(character, 1);
            } else {
                int temp = counter.get(character);
                counter.put(character, ++temp);
            }
        }
        return counter;
    }
}
