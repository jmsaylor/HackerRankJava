package com.johnmsaylor.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GridSearch {

    public static void test() {
        String[] grid = new String[]{"123412",
                "561212",
                "123634",
                "781288"};
        String[] pattern = new String[]{"12",
                "34"};

        System.out.println(gridSearch(grid, pattern));
    }

    static String gridSearch(String[] G, String[] P) {
        for (int row = 0; row <= G.length - P.length; row++) {
            for (int col = 0; col <= G[row].length() - P[0].length(); col++) {
                if (G[row].charAt(col) == P[0].charAt(0)) {
                    for (int i = 0; i < P.length ; i++) {
//                        System.out.println("row " + row + "col " + col);
//                        System.out.println(P[i]);
//                        System.out.println(G[row].substring(col, col + P[0].length()));
//                        System.out.println("-");
                        Pattern pattern = Pattern.compile(P[i]);
                        Matcher matcher = pattern.matcher(G[row + i].substring(col, col + P[0].length()));
                        if (!matcher.matches()) break;
                        if (i == P.length - 1) return "YES";
                    }
//                    System.out.println("hit---");
                }
            }
        }

        return "NO";
    }

}
