package com.johnmsaylor;

import java.util.List;

public class SubArrayDivision {


    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for (int i = 0; i < s.size() - m; i++) {
            int counter = 0;
            for (int j = 0; j < m; j++) {
                counter += s.get(i + j);
            }
            if (counter == d) result++;
        }
        return result;
    }
}
