package com.careerit.cj.collections.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ReadAndWriteJson {

    public static void main(String[] args) {

        String jsonStr = """
        [
        {
          "empno": "EMP001",
          "ename": "Krish",
          "salary": 5000
        },
        {
          "empno": "EMP002",
          "ename": "John",
          "salary": 6000
        }
        ]
        """;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Employee> empList = objectMapper.readValue(jsonStr, new TypeReference<List<Employee>>() {});
            for(Employee emp: empList){
                System.out.println(emp);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
