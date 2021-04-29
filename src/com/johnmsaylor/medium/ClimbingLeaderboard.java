package com.johnmsaylor.medium;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        int[] t = new int[]{100, 100, 50, 40, 40, 20, 10};
        for (int r : t) {
            ranked.add(r);
        }

        List<Integer> player = new ArrayList<>();
        int[] z = new int[]{2, 25, 50, 120};
        for (int x : z) {
            player.add(x);
        }

        climbingLeaderboard(ranked, player);
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        //ranked - descending, player - ascending
        if (player.isEmpty()) return new ArrayList<>();
        List<Integer> resultRanks = new ArrayList<>(player.size());

//        Deque<Integer> rankedDeque = new ArrayDeque<>(ranked.size());
//        rankedDeque.addAll(player);
        Deque<Integer> playerDeque = new ArrayDeque<>(player.size());
        playerDeque.addAll(player);

        Integer currentPlayer = playerDeque.pollLast();
        int currentRank = 1;
        int previous = -1;


        for (int rank : ranked) {
            if (rank == previous && currentPlayer < rank) continue;

            if (rank > currentPlayer) {
                previous = rank;
                currentRank++;
                continue;
            }

            resultRanks.add(currentRank);

            if (currentPlayer != previous) {
                previous = currentPlayer;
                currentRank++;
            }

            currentPlayer = playerDeque.pollLast();

            if (currentPlayer == null) break;
        }

        while (currentPlayer != null) {
            resultRanks.add(currentRank);
            if (currentPlayer == previous) {
                continue;
            }
            currentRank++;
            previous = currentPlayer;
            currentPlayer = playerDeque.pollLast();
        }




        Collections.reverse(resultRanks); //might need more efficient data structure for this
        System.out.println(resultRanks);
        return resultRanks;
    }
}
