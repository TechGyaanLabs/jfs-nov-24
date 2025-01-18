package com.careerit.cj.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ExceptionExample2 {

    public static void main(String[] args) {

        try {
            ObjectMapper obj = new ObjectMapper();
            obj.readValue(ExceptionExample2.class.getResourceAsStream("/emp_data.json"), Object[].class);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
