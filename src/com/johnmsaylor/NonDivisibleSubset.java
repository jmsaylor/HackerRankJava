package com.johnmsaylor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDivisibleSubset {

    public static void test(){
        int k = 3; //non-divisible by
        List<Integer> s = new ArrayList<>();
        s.add(1); s.add(7); s.add(2); s.add(4);
        System.out.println(nonDivisibleSubset(k, s));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here



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
