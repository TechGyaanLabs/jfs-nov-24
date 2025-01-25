package com.careerit.cj.collections.properties;

import java.time.LocalDate;
import java.util.Properties;

public class PropertiesExample1 {

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("version",1.1);
        properties.put("date", LocalDate.now());
        properties.put("desc","Sample Description");

        System.out.println(properties.getProperty("desc"));
    }
}
