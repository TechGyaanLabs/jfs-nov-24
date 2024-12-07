package com.careerit.cj.ipl;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {


        private List<Player> players;

        public PlayerService(){
            this.players = JsonReaderUtil.getPlayerDetails();
        }

        public int getPlayersCount(){
            return players.size();
        }

        public List<Player> getPlayers(String team){
            List<Player> teamPlayers = new ArrayList<>();
            for(Player player:players){
                if(player.getTeam().equalsIgnoreCase(team)){
                    teamPlayers.add(player);
                }
            }
            return teamPlayers;
        }

        public List<String> getPlayerNames(String team){
            // return the list of player names based on the team
            return null;
        }

        public double maxPrice(String team){
            // return the maximum price of the player based on the team
            return 0;
        }

        public double minPrice(String team){
            // return the minimum price of the player based on the team
            return 0;
        }

        public double totalAmount(String team){
            // return the total amount of the team
            return 0;
        }

        public List<Player> getPlayersOfCountry(String country){
            // return the list of players based on the country
            return null;
        }

        public List<Player> getMaxPaidPlayers(String teamName){
           return null;
        }

        private double maxAmount(List<Player> players){
            return 0;
        }

        private double minAmount(List<Player> players){
            return 0;
        }

}
