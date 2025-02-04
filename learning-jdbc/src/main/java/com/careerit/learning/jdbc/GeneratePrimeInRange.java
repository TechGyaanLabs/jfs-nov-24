package com.careerit.learning.jdbc;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratePrimeInRange {

    public static void main(String[] args) {
        int lb = 10;
        int ub = 50;
        for (int i = lb; i <= ub; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

        showTeamsNames();
    }

    private List<Integer> getPrimesInRange(int lb,int ub){
        List<Integer> list = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    private static boolean isPrime(int num) {
        if(num < 2){
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    // read data from team_details.json and show all the team names

    public static void showTeamsNames(){
        String fileName = "/team_details.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = GeneratePrimeInRange.class.getResourceAsStream(fileName)) {
            List<TeamDetails> teamList = objectMapper.readValue(inputStream, new TypeReference<List<TeamDetails>>() {});
            for (TeamDetails team : teamList) {
                System.out.println(team.getTeam());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
