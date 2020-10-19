package com.johnmsaylor;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> magazineMap = frequencyLogger(magazine);
        Map<String, Integer> noteMap = frequencyLogger(note);

        System.out.println( hasExactWords(magazineMap, noteMap) ? "Yes" : "No");
    }

    private static Map<String, Integer> frequencyLogger(String[] content) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : content) {
            if (frequencyMap.putIfAbsent(word, 1) != null){
                int temp = frequencyMap.get(word);
                temp++;
                frequencyMap.put(word, temp);
            }
        }
        return frequencyMap;
    }

    private static boolean hasExactWords(Map<String, Integer> source, Map<String, Integer> target) {
        boolean result = true;
        for (String word : target.keySet()) {
//            System.out.println(magazineMap.get(word) + " : " + noteMap.get(word));
            if (source.get(word) == null || target.get(word) > source.get(word)){
                result = false;
            }
        }
        return result;
    }

}
