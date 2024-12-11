package com.careerit.cj.day10;

public class Player {
    private String name;
    private String role;
    private TshirtSize tshirtSize;

    public Player(String name, String role, TshirtSize tshirtSize) {
        this.name = name;
        this.role = role;
        this.tshirtSize = tshirtSize;
    }

    public void showDetails() {
        System.out.println("Name : "+name);
        System.out.println("Role : "+role);
        System.out.println("Tshirt Size : "+tshirtSize);
    }
}
