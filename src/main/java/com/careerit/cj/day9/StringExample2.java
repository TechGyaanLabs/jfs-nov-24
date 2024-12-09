package com.careerit.cj.day9;

import java.sql.SQLOutput;
import java.util.List;

public class StringExample2 {

    public static void main(String[] args) {

        String str = "WELCOME";
        System.out.println(str.length());
        System.out.println(str.charAt(3));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("Reverse of the string :");

        for(int i=str.length() - 1;i>=0;i--) {
        	System.out.print(str.charAt(i)+" ");
        }

        System.out.println("\nLast 4 characters ");

        String skipFirstThree = str.substring(3);
        String firstThree = str.substring(3, 6);
        String lastFour = str.substring(str.length()- 4);

        System.out.println(skipFirstThree);
        System.out.println(firstThree);
        System.out.println(lastFour);

        String data = " Rajesh T ";
        System.out.println(data.length());
        data = data.trim();
        System.out.println(data.length());

        System.out.println(data.toUpperCase());
        System.out.println(data.toLowerCase());
        System.out.println(data);

        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        List<String> nameList = List.of("John", "Smith", "Doe", "King", "Koch", "Kumar");

        String namesStr = String.join("-", nameList);
        System.out.println(namesStr);

        String namesData = "Harry,John,Smith,Doe,King,Koch,Kumar";
        // ["Harry","John","Smith","Doe","King","Koch","Kumar"]
        String[] names = namesData.split(",");

        for(String name:names) {
        	System.out.println(name.toUpperCase());
        }


    }
}
