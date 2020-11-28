package com.johnmsaylor.medium;

import java.util.*;

public class Maximal2D {

    public static long countMax(List<String> upRight) {
        class Row {
            public List<Integer> row = new ArrayList<>();
        }

        Map<Integer, Row> graph = new HashMap<>();

        graph.put(1, new Row());
        int rowHeight = 1;

        for (String action : upRight) {
            String[] parse = action.split(" ");
            int rows = Integer.parseInt(parse[0]);
            int columns = Integer.parseInt(parse[1]);
            if (rowHeight < rows) {
                while (rowHeight++ < rows) {
                    graph.put(rowHeight, new Row());
                }
            }
            for (int i = 1; i <= rows; i++) {
                Row temp = graph.get(i);
                for (int j = 0; j < columns; j++) {
                    if (j < temp.row.size()) {
                        int cellTemp = temp.row.get(j);
                        temp.row.set(i, ++cellTemp);
                    } else {
                        temp.row.add(1);
                    }
                }
                graph.put(i, temp);
            }

        }
        return 0;
    }
}
