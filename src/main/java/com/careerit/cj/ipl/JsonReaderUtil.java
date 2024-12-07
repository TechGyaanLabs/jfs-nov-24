package com.careerit.cj.ipl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JsonReaderUtil {

    public static List<Player> getPlayerDetails() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/players.json"), new TypeReference<List<Player>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.EMPTY_LIST;
    }
}
