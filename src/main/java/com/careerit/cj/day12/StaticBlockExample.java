package com.careerit.cj.day12;

public class StaticBlockExample {


    static {
        System.out.println("Static block called");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
    }

    static {
        System.out.println("Second static block called");
    }
}
