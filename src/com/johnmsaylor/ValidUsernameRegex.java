package com.johnmsaylor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegex {

    public static void test(String username) {
        Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{7,29}$");
        Matcher matcher = pattern.matcher(username);
        System.out.println(matcher.matches() ? "Valid" : "Invalid");
    }
}
