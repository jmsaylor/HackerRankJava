package com.johnmsaylor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinDistances {

    public static void main(String[] args){

    }

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer globalMin = null;

        for(int n : a){
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                map.put(entry.getKey(), entry.getValue() + 1);
            }
            if (map.containsKey(n)) {
                if (globalMin == null) {
                    globalMin = map.get(n);
                } else {
                    globalMin = Math.min(map.get(n), globalMin);
                }
                map.put(n, 0);
            } else {
                map.put(n, 0);
            }
        }

        return globalMin == null ? -1 : globalMin;
    }
}
