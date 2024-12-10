package com.careerit.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderExample {

    public static void main(String[] args) {

        List<String> names = List.of("John", "David", "Smith", "Doe", "William");

        String greeting = "Welcome to the world of Java";

        // Hello John,
        //     Welcome to the world of Java
        // Thank you

        List<String> greetings = new ArrayList<>();
        for(String name:names) {
           StringBuilder sb = new StringBuilder();
              sb.append("Hello ").append(name).append(",\n")
                .append("\t").append(greeting).append("\n")
                .append("Thank you");
                greetings.add(sb.toString());
        }

        for(String greet:greetings) {
            System.out.println(greet);
            System.out.println("-------------------------------------------------");
        }

    }
}
