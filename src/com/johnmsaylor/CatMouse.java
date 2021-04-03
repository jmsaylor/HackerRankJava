package com.johnmsaylor;

public class CatMouse {

    static String catAndMouse(int x, int y, int z) {
        int diffA = Math.abs(x - z);
        int diffB = Math.abs(y - z);

        if (diffA == diffB) {
            return "Mouse C";
        } else {
            return diffA < diffB ? "Cat A" : "Cat B";
        }

    }
}
