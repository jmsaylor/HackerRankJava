package com.johnmsaylor.medium;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        TreeSet<Integer> leaderboard = new TreeSet<>(ranked);
        List<Integer> ranks = new ArrayList<>(leaderboard);
        List<Integer> result = new ArrayList<>();
        int rank = leaderboard.size() + 1;
        int marker = 0;

        for (int score : player) {
            for (int i = marker; i < ranks.size(); i++) {
                if (score >= ranks.get(i)) {
                    rank = ranks.size() - i;
                    marker = i;
                } else break;
            }
            result.add(rank);
        }
        return result;

    }
}
