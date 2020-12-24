package com.johnmsaylor;

import java.util.*;
import java.util.stream.Collectors;

public class Memoization {

    public static Long fib(Long n, HashMap<Long, Long> memo){
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1L;
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }

    public static boolean canSum(int target, int[] numbers, HashMap<Integer, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return true;
        if (target < 0) return false;

        for (int number : numbers) {
            int remainder = target - number;
            if (canSum(remainder, numbers, memo)) {
                memo.put(target, true);
                return true;
            }
        }
        memo.put(target, false);
        return false;
    }

    public static List<Integer> howSum(int targetSum, int[] numbers, HashMap<Integer, List> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (int num : numbers) {
            int remainder = targetSum - num;
            List<Integer> remainderResult = howSum(remainder, numbers, memo);
            System.out.println(remainderResult);
            if (remainderResult != null) {
                remainderResult.add(num);
                memo.put(targetSum, remainderResult);
                System.out.println(memo);
                return memo.get(targetSum);
            }
        }

        memo.put(targetSum, null);
        return null;
    }

    public static List<Integer> bestSum(int target, int[] numbers, HashMap<Integer, List<Integer>> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new ArrayList<>();
        if (target < 0) return null;

        List<Integer> shortestCombination = null;

        for (int num : numbers){
            int remainder = target - num;
            List<Integer> remainderCombination = bestSum(remainder, numbers, memo);
            if (remainderCombination != null) {
                List<Integer> combination = new ArrayList<>(remainderCombination);
                combination.add(num);
                if (shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        memo.put(target, shortestCombination);
        return shortestCombination;
    }

    public static Long gridTraveller(int n, int m, HashMap<String, Long> memo) {
        String key = n + "," + m;

        if (memo.containsKey(key)) return memo.get(key);
        if (n == 1 && m == 1) return 1L;
        if (n == 0 || m == 0) return 0L;

        memo.put(key, gridTraveller(n - 1, m, memo) + gridTraveller(n, m - 1, memo));
        return memo.get(key);
    }

    public static boolean canConstruct(String target, String[] wordbank, Map<String, Boolean> memo){
        if (memo.containsKey(target)) return memo.get(target);
        if (target.length() == 0) return true;

        for (String word : wordbank) {
            if (target.startsWith(word)){
                String newTarget = target.substring(word.length());
                if (canConstruct(newTarget, wordbank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }

        memo.put(target, false);
        return false;
     }

     public static int countConstruct(String target, String[] wordbank, Map<String, Integer> memo){
        if (memo.containsKey(target))return memo.get(target);
        if (target.length() == 0) return 1;

        int totalCount = 0;

        for (String word : wordbank){
            if (target.indexOf(word) == 0) {
                int numWaysForRest = countConstruct(target.substring(word.length()), wordbank, memo);
                totalCount += numWaysForRest;
            }
        }

        memo.put(target, totalCount);
        return totalCount;
     }

     public static List<List<String>> allConstruct(String target, String[] wordbank){
        if (target.isBlank()) return new ArrayList();

        List<List<String>> result = new ArrayList<>();

        for (String word : wordbank){
            if (target.startsWith(word)){
                List<List<String>> suffixWays = allConstruct(target.substring(word.length()), wordbank);
                List<List<String>> targetWays = new ArrayList(suffixWays);
                if (suffixWays.isEmpty()) {
                    List<String> newList = new ArrayList<>();
                    newList.add(word);
                    targetWays.add(newList);
                } else {
                    for (List<String> way : targetWays) {
                        way.add(word);
                    }
                }
                result.addAll(targetWays);
            }
        }
        return result;
     }
}
