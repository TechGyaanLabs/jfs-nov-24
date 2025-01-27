package com.careerit.learning.jdbc;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamDetailsService {

    public static void main(String[] args) {

        //addTeamDetailsToDB();
        List<PlayerBasicDetailsDto> players = getPlayersByTeam("CSK");
        System.out.println(players);

    }

    public static List<PlayerBasicDetailsDto> getPlayersByTeam(String team) {
        String sql = """
                    select
                            	p.name,
                            	p.role,
                            	p.team,
                            	t.team_name,
                            	p.price
                            from
                            	player p
                            inner join team_details t on
                            	p.team = t.team
                            where
                            	p.team = ?;
                """;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, team);
            rs = pst.executeQuery();
            List<PlayerBasicDetailsDto> playerList = new ArrayList<>();
            while (rs.next()) {
                PlayerBasicDetailsDto player = new PlayerBasicDetailsDto();
                player.setName(rs.getString("name"));
                player.setRole(rs.getString("role"));
                player.setTeam(rs.getString("team"));
                player.setTeamName(rs.getString("team_name"));
                player.setPrice(rs.getDouble("price"));
                playerList.add(player);
            }
            return playerList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.EMPTY_LIST;
    }

    public static void addTeamDetailsToDB() {
        // Read the data from the file
        // insert the data into the team_details table
        List<TeamDetails> teamDetails = getTeamDetails();

        String add_player_sql = "insert into team_details(team,team_name,total_players,overseas_players,total_amount,remaining_amount) values(?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = DbConnectionUtil.getConnection();
            pst = con.prepareStatement(add_player_sql);

            for (TeamDetails teamDetail : teamDetails) {
                pst.setString(1, teamDetail.getTeam());
                pst.setString(2, teamDetail.getTeamName());
                pst.setLong(3, teamDetail.getTotalPlayers());
                pst.setLong(4, teamDetail.getOverseasPlayers());
                pst.setDouble(5, teamDetail.getTotalAmount());
                pst.setDouble(6, teamDetail.getRemainingAmount());
                pst.addBatch();
            }
            int[] resultArr = pst.executeBatch();
            System.out.println("No of records inserted : " + resultArr.length);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbConnectionUtil.close(pst, con);
        }

    }

    public static List<TeamDetails> getTeamDetails() {
        String fileName = "/team_details.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<TeamDetails> teamList = objectMapper.readValue(TeamDetailsService.class.getResourceAsStream(fileName),
                    new TypeReference<List<TeamDetails>>() {
                    });
            System.out.println("Data read from the file");
            return teamList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.EMPTY_LIST;
    }
}
