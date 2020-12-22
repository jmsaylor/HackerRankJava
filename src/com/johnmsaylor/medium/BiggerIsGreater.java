package com.johnmsaylor.medium;

public class BiggerIsGreater {

    public static String biggerIsGreater(String w) {
        int insertIndex = w.length() - 2;
        int selected = w.length() - 1;


        while (w.charAt(insertIndex) >= w.charAt(selected)) {
            insertIndex--;
            if (insertIndex == -1) {
                selected--;
                insertIndex = selected - 1;
            }
            if (selected == -1) return "no answer";
        }

        StringBuilder temp = new StringBuilder(w);
        char letter = w.charAt(selected);
        temp.delete(selected, selected + 1);
        temp.insert(insertIndex, letter);
        return temp.toString();
    }
}
