package com.careerit.cj.collections.mapex;

import com.careerit.cj.collections.json.JsonUtil;
import com.careerit.cj.ipl.Player;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

public class PlayerManager {

    public static void main(String[] args) {

        List<Player> players = getPlayers();
        System.out.println("Total players : " + players.size());
        Map<String, List<Player>> teamPlayerMap = getTeamPlayerMap(players);

        Set<String> teams = teamPlayerMap.keySet();
        for (String team : teams) {
            List<Player> playerList = teamPlayerMap.get(team);
            System.out.println("Team : " + team + " : " + playerList);
        }

        Map<String,Map<String,List<Player>>> teamCountryPlayerMap = getTeamCountryPlayerMap(players);


    }

    private static Map<String, Map<String, List<Player>>> getTeamCountryPlayerMap(List<Player> players) {
        Map<String,Map<String,List<Player>>> map = new HashMap<>();
        return null;
    }

    private static Map<String, List<Player>> getTeamPlayerMap(List<Player> players) {
        Map<String, List<Player>> map = new HashMap<>();
        for (Player player : players) {
            map.computeIfAbsent(player.getTeam(), k -> new ArrayList<>());
            List<Player> tempList = map.get(player.getTeam());
            tempList.add(player);
            map.put(player.getTeam(), tempList);
        }
        return map;
    }


    private static List<Player> getPlayers() {
        String fileName = "/players.json";
        return JsonUtil.readListData(fileName, new TypeReference<List<Player>>() {
        });
    }

}
