package com.careerit.cj.ipl;

import java.util.List;
import java.util.Scanner;

public class Manager {

    public static void main(String[] args) {


        PlayerService obj = new PlayerService();

        int count = obj.getPlayersCount();
        System.out.println("Total players :"+count);

        String teamName = "CSK";
        System.out.println("Players in the team :"+teamName);
        List<Player> players = obj.getPlayers(teamName);
        for(Player player:players){
            System.out.println(player);
        }

        List<Player> maxPaidPlayers = obj.getMaxPaidPlayers(teamName);
        System.out.println("Max paid player(s) :");
        for(Player player:maxPaidPlayers){
            System.out.println(player);
        }

    }
}
