package com.johnmsaylor.main;
import com.johnmsaylor.Memoization;
import com.johnmsaylor.NestedLogic;
import com.johnmsaylor.Tabulation;
import com.johnmsaylor.medium.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var ranks = "100 90 90 80 75 60".split(" ");
        var scores = "50 65 77 90 102".split(" ");
        List<Integer> ranksA = new ArrayList<>();
        List<Integer> scoresA = new ArrayList<>();
        for (String rank : ranks) {
            ranksA.add(Integer.valueOf(rank));
        }
        for (String score : scores){
            scoresA.add(Integer.valueOf(score));
        }
        var result = ClimbingLeaderboard.climbingLeaderboard(ranksA, scoresA);
        System.out.println(result);
    }

}
