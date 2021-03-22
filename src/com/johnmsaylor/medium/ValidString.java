package com.johnmsaylor.medium;

import java.util.HashMap;
import java.util.HashSet;

public class ValidString {
    public static void test() {
        System.out.println(isValid("ddooggc"));
        System.out.println(isValid("doggg"));
    }

    static String isValid(String s) {
        //count the characters in a hashmap
        HashMap<Character, Integer> set = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (!set.containsKey(c)) {
                set.put(c, 1);
            } else {
                int temp = set.get(c);
                set.put(c, ++temp);
            }
        }
        //determine total unique keys
        System.out.println(set.size());
        //all values in hashset should be s.length/unique
        //if one is +1 return YES, of more NO

        boolean result = true;

        final int count_limit = s.length() / set.size();
        //already has seen diff +1
        boolean warning = false;

        for (Character key : set.keySet()) {
            if (set.get(key) > count_limit) {
                if(set.get(key) > count_limit + 1 || warning) {
                    result = false;
                    break;
                } else {
                    warning = true;
                }
            }
        }

        return result ? "YES" : "NO";
    }
}
