package com.johnmsaylor.medium;

public class PDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int[] asci = new int[word.length()];
        char[] charArray = word.toCharArray();

        int maxHeight = 0;

        for (int i = 0; i < charArray.length; i++) {
            asci[i] = (int) charArray[i] - 97;
            maxHeight = Math.max(maxHeight, h[charArray[i] - 97]);
        }

        return maxHeight * word.length();
    }
}
