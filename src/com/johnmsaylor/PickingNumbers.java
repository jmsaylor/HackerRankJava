package com.johnmsaylor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : a){
            if (!counts.containsKey(num)){
                counts.put(num, 1);
            } else {
                counts.put(num, (counts.get(num) + 1);
            }
        }

        int[] table = new int[a.size()];

        for (int i = 1; i < 99; i++) {
            if (!counts.containsKey(i)) continue;
            int current = counts.get(i);
            int left = 0;
            int right = 0;

            if (counts.containsKey(i - 1)) {
                left = current + counts.get(i - 1);
            }
            if (counts.containsKey(i + 1)) {
                right = current + counts.get(i + 1);
            }

            table[i] = left == 0 && right == 0 ? current : Math.max(left, right);
        }

        int result = 0;

        for (int temp : table){
            result = Math.max(result, temp);
        }

        return result;
    }
}
