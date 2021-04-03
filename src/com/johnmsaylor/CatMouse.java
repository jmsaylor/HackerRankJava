package com.johnmsaylor;

public class CatMouse {

    static String catAndMouse(int x, int y, int z) {
        String result = "";

        int diffA = Math.abs(x - z);
        int diffB = Math.abs(y - z);

        if (diffA == diffB) {
            result = "Mouse C";
        } else {
            result = diffA < diffB ? "Cat A" : "Cat B";
        }

        return result;
    }
}
