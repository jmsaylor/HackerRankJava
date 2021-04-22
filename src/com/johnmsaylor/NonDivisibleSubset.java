package com.johnmsaylor;

import java.util.*;

public class NonDivisibleSubset {

    public static void main(String[] args){
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++) {
            input.add(i);
        }
        System.out.println(nonDivisibleSubset(10, input));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        System.out.println(s);
        int[] table = new int[k];
        Arrays.fill(table, 0);

        for (Integer n : s) {
            table[n % k]++;
        }

        System.out.println(Arrays.toString(table));

        int result = 0;

        for (int i = 1; i <= table.length / 2; i++) {
            result += Math.max(table[i], table[k - i]);
        }

        if (table[0] > 0) result += 1;

        return result;
    }

    public static int nonDivisibleSubset4(int k, List<Integer> s) {
        List<List<Boolean>> results = new ArrayList<>();

        for (int i = 0; i < s.size(); i++) {
            List<Boolean> current = new ArrayList<>();
            for (int j = 0; j < s.size(); j++) {
                current.add((s.get(i) + s.get(j)) % k != k);
            }
            results.add(current);
        }

        int maxLength = 0;

        for (List<Boolean> result : results) {
            int current = 0;
            for (Boolean check : result) {
                if (check) current++;
            }
            maxLength = Math.max(maxLength, current);
        }

        return maxLength;

    }

    public static int nonDivisibleSubsetFirst(int k, List<Integer> s) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.size() - 1; i++) {
            for (int j = i + 1; j < s.size(); j++) {
                if (!isDivisible((s.get(i) + s.get(j)), k)) {
                    System.out.println("true");
                    addToSet(s.get(i), set, k);
                    addToSet(s.get(j), set, k);
                }
            }
        }
        return set.size();
    }

    public static boolean isDivisible(Integer num, Integer k) {
        return num % k == 0;
    }

    public static void addToSet(Integer num, Set<Integer> set, Integer k) {
        if (set.size() < 1) {
            set.add(num);
            return;
        }
        if (!set.contains(num)){
            for (Integer inSet : set) {
                if (!isDivisible(num + inSet, k)) {
                    set.add(num);
                }
            }
        }
    }

}
