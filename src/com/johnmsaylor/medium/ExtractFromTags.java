package com.johnmsaylor.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFromTags {
    public static void test(String line) {
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);


        if (matcher.matches()) {
            matcher.reset();
            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }
        } else {
            System.out.println("None");
        }

    }
}
