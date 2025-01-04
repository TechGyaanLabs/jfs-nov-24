package com.careerit.cj.collections.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class WriteJsonExample {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmpno("EMP1005");
        employee.setSalary(5500);
        employee.setEname("Manoj");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String empStr = objectMapper.writer(new DefaultPrettyPrinter()).writeValueAsString(employee);
            System.out.println(empStr);
            objectMapper.writer(new DefaultPrettyPrinter()).writeValue(new File("emp.json"),employee);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
