package com.careerit.cj.day10;

public class Project {
    private String name;
    private String client;
    private String location;

    public Project(String name, String client, String location) {
        this.name = name;
        this.client = client;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
