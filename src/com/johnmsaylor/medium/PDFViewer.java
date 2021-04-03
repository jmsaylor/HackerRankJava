package com.johnmsaylor.medium;

public class PDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;

        for (char c : word.toCharArray()) {
            maxHeight = Math.max(maxHeight, h[(int) c - 97]);
        }

        return maxHeight * word.length();
    }
}
