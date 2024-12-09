package com.careerit.cj.day9;

public class StringExample1 {

    public static void main(String[] args) {

            String str1 = "Hello";
            String str2 = "Hello";

            System.out.println(str1 == str2);
            System.out.println(str1.equals(str2));

            String str3 = new String("Hello");
            String str4 = new String("Hello");

            System.out.println(str3 == str4);
            System.out.println(str3.equals(str4));

            String name = "John";
            System.out.println(name);
            name = name.concat(" Doe");
            System.out.println(name);
    }
}
