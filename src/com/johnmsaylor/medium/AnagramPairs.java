package com.johnmsaylor.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramPairs {

    public static void test() {
        System.out.println( sherlockAndAnagrams("kkkk"));
    }

    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> table = new HashMap<>();
        int result = 0;



        for (int windowSize = 1; windowSize <= s.length() - 1; windowSize++) {
            for (int start = 0; start + windowSize <= s.length() ; start++) {
                char[] substring = s.substring(start, start + windowSize).toCharArray();
                Arrays.sort(substring);
                String key = new String(substring);
                if (table.containsKey(key)){
                    int counter = table.get(key);
                    result += counter;
                    counter++;
                    table.put(key, counter);
                } else {
                    table.put(key, 1);
                }
            }
        }

        return result;
    }
}
