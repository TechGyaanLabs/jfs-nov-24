package com.careerit.cj.collections.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.List;


public class JsonUtil {


    public  static <T> List<T> readListData(String fileName,TypeReference<List<T>> typeReference) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(JsonUtil.class.getResourceAsStream(fileName), typeReference);
        } catch (Exception e) {
            System.out.println(e);
        }
        return Collections.emptyList();
    }

    public static <T> T readData(String fileName,TypeReference<T> typeReference) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(JsonUtil.class.getResourceAsStream(fileName), typeReference);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static JsonNode readData(String fileName){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readTree(JsonUtil.class.getResourceAsStream(fileName));
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }


}
