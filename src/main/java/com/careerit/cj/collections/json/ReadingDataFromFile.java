package com.careerit.cj.collections.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

public class ReadingDataFromFile {

    public static void main(String[] args) {

        String fileName = "/emp_data.json";

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream res = ReadAndWriteJson.class.getResourceAsStream(fileName);
            List<Employee> employees = objectMapper.readValue(res,
                    new TypeReference<List<Employee>>() {});
            System.out.println(employees);
        }catch (Exception e){
            System.out.println(e);
        }



    }
}
