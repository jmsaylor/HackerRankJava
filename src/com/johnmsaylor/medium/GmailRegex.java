package com.johnmsaylor.medium;

import java.util.List;
import java.util.regex.Pattern;

public class GmailRegex {

    public static void find(String email){
        boolean result = Pattern.matches(".*@gmail\\.com$", email);
        System.out.println(result);
    }
}
