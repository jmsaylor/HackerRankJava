package com.johnmsaylor;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Delimiters {

    public static void test(String sentence){
        String[] tokens = sentence.trim().split("[!,?._'@]+");
        List cleanTokens = Arrays.stream(tokens).filter(x -> x.length() > 0 && x.charAt(0) != ' ').collect(Collectors.toList());
        System.out.println(cleanTokens.size());
        for (Object token : cleanTokens) {
            System.out.println(token);
        }
    }

}
