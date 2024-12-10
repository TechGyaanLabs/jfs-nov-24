package com.careerit.cj.day9;


public class StringExample4 {

    public static void main(String[] args) {

        Player player = new Player("Dhoni", "WK", "IND", 1000000, "CSK");

        // Name : Dhoni, Role : WK, Country : IND, Price : 1000000, Team : CSK
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(player.getName()).append(", ")
        .append("Role : ").append(player.getRole()).append(", ")
        .append("Country : ").append(player.getCountry()).append(", ")
        .append("Price : ").append(player.getPrice()).append(", ")
        .append("Team : ").append(player.getTeam());

        String output = sb.toString();

        System.out.println(output);
    }
}