package com.johnmsaylor.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneBalancing {
    //smallest possible substring

    //balanced gene has equal parts A,C,T,G

    //find smallest sequence to replace with anything to make gene balanced

    public static void test() {
        System.out.println(steadyGene("GAAATAAA")); // 5
//        System.out.println(steadyGene(""));
    }

    static int steadyGene(String gene) {
        //1.//count the characters - HashMap
            //contains characters and number of occurences
        System.out.println(gene);
        HashMap<Character, Integer> characters = new HashMap<>();
        char[] chars = gene.toCharArray();
        //1.//count the characters - HashMap
        //contains characters and number of occurences
        for(char ch : chars) {
            if(characters.containsKey(ch)) {
                characters.put(ch, characters.get(ch) + 1);
            }
            else {
                characters.put(ch, 1);
            }
        }

        System.out.println(characters);

        //2/// Find difference between actual and desired character counts
        // gene.length()/4 => desired count of each character vs. values in HashMap
        // How many A,C,T,or G do we need?
        String prototype = "";

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            if(entry.getValue() > (gene.length()/4)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                // Make a string that contains all chars we need to find
                // We need to build a prototype of a string.
                for (int i = 0; i < entry.getValue() - (gene.length()/4); i++) {
                    prototype = prototype.concat(String.valueOf(entry.getKey()));
                }
            }
//            else if(entry.getValue() < (gene.length()/4) {
//            }
        }

        System.out.println(prototype);

        //3// Find the (minimal) substring to replace
            // we have to know what characters we are looking to remove and how many
            // find the smallest string with those amounts of characters
                // if a substring contains all the amounts of these characters, then it's a match
            //How??

        Pattern pattern = Pattern.compile(prototype);
        Matcher matcher = pattern.matcher(gene);

        while (matcher.find()){

        }
        return 0;
    }
}
