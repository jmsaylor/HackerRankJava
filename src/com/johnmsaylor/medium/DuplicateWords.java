package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DuplicateWords {

    // Essence of Another Solution
//    String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
//    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//    while (m.find()) {
//        input = input.replaceAll(m.group(), m.group(1));
//    }

    public static void test(String text) {
        String[] words = text.trim().split("\\s");
        System.out.println(Arrays.toString(words));
        List<Pattern> existingPatterns = new ArrayList<>();
        String result = "";

        for (String word : words) {
            Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
            //can this be made to work?
            if (!existingPatterns.contains(pattern)) {
                existingPatterns.add(pattern);
                result.concat(word + " ");
            }
        }

        System.out.println(result);
    }
}
