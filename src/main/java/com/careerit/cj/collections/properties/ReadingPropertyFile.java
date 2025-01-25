package com.careerit.cj.collections.properties;

import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {

    public static void main(String[] args) {

        // Stack
        // PriorityQueue
        // LinkedList

        Properties properties = new Properties();
        try{
            properties.load(ReadingPropertyFile.class.getResourceAsStream("/db-config.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String dbName = properties.getProperty("dbname");

            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
            System.out.println(dbName);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
