package com.careerit.cj.iplstats.util;

import com.careerit.cj.iplstats.domain.Player;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonUtil {
    public static List<Player> loadPlayers(String fileName) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(JsonUtil.class.getResource(fileName), new TypeReference<List<Player>>(){});
        }catch (Exception e){
            System.out.println(e);
        }
        return List.of();
    }
}
