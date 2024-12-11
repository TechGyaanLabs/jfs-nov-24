package com.careerit.cj.day10;

public class MealBooking {
    private String name;
    private String location;
    private Day day;
    private int noPersons;

    public MealBooking(String name, String location, Day day,int noPersons) {
        this.name = name;
        this.location = location;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public int getNoPersons() {
        return noPersons;
    }

    public void setNoPersons(int noPersons) {
        this.noPersons = noPersons;
    }
}
