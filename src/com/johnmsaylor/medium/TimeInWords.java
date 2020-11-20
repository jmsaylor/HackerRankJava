package com.johnmsaylor.medium;

import java.util.HashMap;
import java.util.Map;

public class TimeInWords {
    public static String timeInWords(int h, int m) {
        Map<Integer, String> wordMap = getTimeWords();
        final String MINUTES_WORD = m == 1 ? " minute" : " minutes";
        String result;

        if (m == 0) {
            result = wordMap.get(h) + " o" + "'" + "clock";
        } else if (m <= 30) {
            result = m == 15 || m == 30 ?
                    wordMap.get(m) + " past " + wordMap.get(h) :
                    wordMap.get(m) + MINUTES_WORD + " past " + wordMap.get(h);
        } else {
            h = h == 12 ? 1 : h + 1;
            final int MINUTES_REMAINING = 60 - m;
            result = MINUTES_REMAINING == 15 ?
                    wordMap.get(MINUTES_REMAINING) + " to " + wordMap.get(h) :
                    wordMap.get(MINUTES_REMAINING) + MINUTES_WORD + " to " + wordMap.get(h);
        }

        return result;

    }

    static Map<Integer, String> getTimeWords() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "quarter");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        for (int i = 1; i <= 9; i++) {
            map.put(20 + i, "twenty " + map.get(i));
        }
        map.put(30, "half");
        return map;
    }
}
