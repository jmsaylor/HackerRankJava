package com.johnmsaylor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RansomNote2 {
    public static void checkMagazine(String[] magazine, String[] note) {
        var noteMap = new FrequencyMap(note);
        var magazineMap = new FrequencyMap(magazine);

        boolean result = true;
        for (String word : noteMap.getWords()) {
            if (noteMap.getWordFrequency(word) > magazineMap.getWordFrequency(word)) {
                result = false;
            }
        }
        System.out.println(result ? "YES" : "NO");
    }
}

class FrequencyMap {
    Map<String, Integer> frequencyMap = new HashMap<>();

    public FrequencyMap(String[] words) {
        for (String word : words) {
            log(word);
        }
    }

    public void log(String word) {
        if (frequencyMap.containsKey(word)) {
            incrementWord(word);
        } else {
            createWord(word);
        }
    }

    private void incrementWord(String word) {
        frequencyMap.put(word, frequencyMap.get(word) + 1);
    }

    private void createWord(String word) {
        frequencyMap.put(word, 1);
    }

    public Set<String> getWords() {
        return frequencyMap.keySet();
    }

    public int getWordFrequency(String word) {
        return frequencyMap.get(word);
    }
}
