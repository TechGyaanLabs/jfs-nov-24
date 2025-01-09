package com.careerit.cj.collections.streams;

import com.careerit.cj.collections.json.JsonUtil;
import com.careerit.cj.iplstats.domain.Player;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample3 {

    public static void main(String[] args) {

        List<Player> players = JsonUtil.readListData("/players.json", new TypeReference<List<Player>>() {});



        Map<String,DoubleSummaryStatistics> teamStats =
                players.stream()
                        .collect(Collectors.groupingBy(Player::getTeam,
                                Collectors.summarizingDouble(Player::getPrice)));

        teamStats.forEach((team,stats)->{
            System.out.println("Team : "+team);
            System.out.println("Total players : "+stats.getCount());
            System.out.println("Total amount : "+stats.getSum());
            System.out.println("Average amount : "+stats.getAverage());
            System.out.println("Max amount : "+stats.getMax());
            System.out.println("Min amount : "+stats.getMin());
            System.out.println("-------------------------------------------------");
        });

        Map<String,List<Player>> teamPlayers = players.stream()
                .collect(Collectors.groupingBy(Player::getTeam,Collectors.toList()));

        teamPlayers.forEach((team,playerList)->{
            System.out.println("Team : "+team);
            playerList.forEach(System.out::println);
            System.out.println("-------------------------------------------------");
        });

        // Top n rank players based on price
        int n = 5;
        List<Player> topNRankPlayers = players.stream()
                .sorted(Comparator.comparing(Player::getPrice).reversed())
                .limit(18)
                .toList();

        topNRankPlayers.forEach(System.out::println);

    }
}
