package com.careerit.cj.day9;

public class Player {

    private String name;
    private String role;
    private String country;
    private double price;
    private String team;

    public Player(String name, String role, String country, double price, String team) {
        this.name = name;
        this.role = role;
        this.country = country;
        this.price = price;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
