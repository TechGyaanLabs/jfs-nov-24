package com.careerit.learning.jdbc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDetails {
    private String team;
    private String teamName;
    private double totalAmount;
    private double remainingAmount;
    private long overseasPlayers;
    private long totalPlayers;
}
